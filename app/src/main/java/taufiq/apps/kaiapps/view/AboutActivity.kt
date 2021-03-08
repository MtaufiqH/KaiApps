package taufiq.apps.kaiapps.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.CircleCropTransformation
import taufiq.apps.kaiapps.R
import taufiq.apps.kaiapps.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivProfil.load(R.drawable.taufiq) {
            crossfade(true)
            transformations(CircleCropTransformation())
        }
    }
}