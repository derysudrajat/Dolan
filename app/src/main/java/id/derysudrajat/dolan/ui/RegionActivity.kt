package id.derysudrajat.dolan.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import id.derysudrajat.dolan.R
import id.derysudrajat.dolan.adapter.DestinationMainAdapter
import id.derysudrajat.dolan.databinding.ActivityRegionBinding
import id.derysudrajat.dolan.model.Region

class RegionActivity : AppCompatActivity() {

    companion object {
        const val DATA_REGION_EXTRA = "data_region_extra"
    }

    private lateinit var binding: ActivityRegionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataIntent = intent.getParcelableExtra<Region>(DATA_REGION_EXTRA)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = dataIntent?.title
            titleColor = ContextCompat.getColor(this@RegionActivity,
                R.color.colorGray
            )
            setDisplayHomeAsUpEnabled(true)
        }

        val mAdapter = DestinationMainAdapter(
            this,
            dataIntent?.listDestination!!
        )

        binding.rvMain.apply {
            setHasFixedSize(true)
            itemAnimator = DefaultItemAnimator()
            adapter = mAdapter
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }
}