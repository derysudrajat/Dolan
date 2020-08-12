package id.derysudrajat.dolan.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import id.derysudrajat.dolan.R
import id.derysudrajat.dolan.databinding.ActivityProfileBinding
import id.derysudrajat.dolan.util.Data
import kotlinx.android.synthetic.main.layout_content_profile.*

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            ivBanner.load(Data.User.bg) { crossfade(true) }
            ivProfile.load(Data.myAva) {
                crossfade(true)
            }

            includeLayout.ivGithub.load(Data.User.github) { crossfade(true) }
            includeLayout.ivIg.load(Data.User.ig) { crossfade(true) }
            includeLayout.ivMedium.load(Data.User.medium) { crossfade(true) }

            contentIg.setOnClickListener {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://${tvIg.text}/")
                    )
                )
            }
            contentGithub.setOnClickListener {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://${tvGithub.text}/")
                    )
                )
            }
            contentMedium.setOnClickListener {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://${tvMedium.text}/")
                    )
                )
            }

        }

        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.profile)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }
}