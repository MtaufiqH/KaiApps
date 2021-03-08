package taufiq.apps.kaiapps.view

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import android.view.WindowManager
import coil.load
import taufiq.apps.kaiapps.R
import taufiq.apps.kaiapps.adapter.CategoryItemImage
import taufiq.apps.kaiapps.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding

    companion object {
        // delaying activity function
        fun delayFunction(function: () -> Unit, delay: Long) {
            @Suppress("DEPRECATION")
            Handler().postDelayed(function, delay)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
            setContentView(binding.root)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

            binding.imageView.load(CategoryItemImage.LOGO)

            delayFunction({ toHome() }, 2000)
        }
    }

    fun toHome(){
        Intent(this,MainActivity::class.java).run { startActivity(this) }
        finishAffinity()
    }
}