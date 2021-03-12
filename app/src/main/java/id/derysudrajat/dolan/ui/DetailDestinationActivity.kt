package id.derysudrajat.dolan.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import coil.load
import id.derysudrajat.dolan.adapter.DetailPhotosAdapter
import id.derysudrajat.dolan.databinding.ActivityDetailDestinationBinding
import id.derysudrajat.dolan.model.Destination
import id.derysudrajat.dolan.util.Data.getColorFromAttr

class DetailDestinationActivity : AppCompatActivity() {

    companion object {
        const val DESTINATION_EXTRA = "destination_extra"
    }

    private lateinit var binding: ActivityDetailDestinationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDestinationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val dataIntent = intent.getParcelableExtra<Destination>(DESTINATION_EXTRA)
        val mAdapter = DetailPhotosAdapter(
            this,
            dataIntent?.photos!!
        )

        binding.apply {
            collapsingToolbar.apply {
                title = dataIntent.name
                setCollapsedTitleTextColor(
                    getColorFromAttr(android.R.attr.textColor)
                )
                setExpandedTitleColor(
                    ContextCompat.getColor(
                        this@DetailDestinationActivity,
                        android.R.color.white
                    )
                )
            }

            rvPhotos.apply {
                setHasFixedSize(true)
                itemAnimator = DefaultItemAnimator()
                adapter = mAdapter
            }

            ivBanner.load(dataIntent.bannerPhoto) {
                crossfade(true)
            }

            tvPlace.text = dataIntent.place
            tvName.text = dataIntent.name
            tvDesc.text = dataIntent.desc
            ratingBar.rating = dataIntent.rating!!
            tvRating.text = dataIntent.rating.toString()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }
}