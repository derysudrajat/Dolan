package id.derysudrajat.dolan.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.CircleCropTransformation

import id.derysudrajat.dolan.R
import id.derysudrajat.dolan.databinding.ActivityProfileBinding
import id.derysudrajat.dolan.databinding.LayoutContentProfileBinding
import id.derysudrajat.dolan.util.Data

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private lateinit var contentBinding: LayoutContentProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        contentBinding = binding.includeLayout
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.profile)
        }

        binding.apply {
            ivBanner.load(Data.User.bg) { crossfade(true) }
            ivProfile.load(Data.myAva) {
                crossfade(true)
                transformations(CircleCropTransformation())
            }

            with(contentBinding) {
                ivGithub.load(Data.User.github) {
                    crossfade(true)
                    transformations(CircleCropTransformation())
                }

                ivIg.load(Data.User.ig) {
                    crossfade(true)
                    transformations(CircleCropTransformation())
                }
                ivMedium.load(Data.User.medium) {
                    crossfade(true)
                    transformations(CircleCropTransformation())
                }

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
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }
}