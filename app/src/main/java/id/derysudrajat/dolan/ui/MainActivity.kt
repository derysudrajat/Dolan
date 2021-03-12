package id.derysudrajat.dolan.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import coil.load
import coil.transform.CircleCropTransformation
import id.derysudrajat.dolan.R
import id.derysudrajat.dolan.adapter.DestinationMainAdapter
import id.derysudrajat.dolan.databinding.ActivityMainBinding
import id.derysudrajat.dolan.databinding.ItemCarouselBinding
import id.derysudrajat.dolan.util.Data
import id.derysudrajat.dolan.util.Data.round

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = Data.data

        Log.d(TAG, "onCreate: data = ${data.size}")

        binding.carouselView.apply {
            size = 3
            resource = R.layout.item_carousel
            scaleOnScroll = true
            spacing = -50
            hideIndicator(true)
            setCarouselViewListener { view, position ->
                val carouselBinding = ItemCarouselBinding.bind(view)
                carouselBinding.apply {
                    val region = Data.getSummaryRegion(position)
                    imageView.load(region.banner) {
                        crossfade(true)
                    }
                    tvName.text = region.title
                    tvPlace.text = region.place
                    tvRating.text = region.ratingAve!!.round(1).toString()
                    ratingBar.rating = region.ratingAve
                    tvDestination.text = StringBuilder().append(region.listDestination!!.size)
                        .append(" ").append(getString(R.string.destinasi)).toString()
                    contentCaraousel.setOnClickListener {
                        val intent = Intent(this@MainActivity, RegionActivity::class.java)
                        intent.putExtra(RegionActivity.DATA_REGION_EXTRA, region)
                        startActivity(intent)
                    }
                }
            }
            show()
        }

        binding.rvMain.apply {
            setHasFixedSize(true)
            itemAnimator = DefaultItemAnimator()
            adapter = DestinationMainAdapter(context, data)
        }

        binding.ivAvatar.apply {
            load(Data.myAva) {
                crossfade(true)
                transformations(CircleCropTransformation())
            }
            setOnClickListener {
                startActivity(
                    Intent(this@MainActivity, ProfileActivity::class.java)
                )

            }
        }
    }
}