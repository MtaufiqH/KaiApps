package taufiq.apps.kaiapps.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import taufiq.apps.kaiapps.R
import taufiq.apps.kaiapps.databinding.ActivitySuccessBinding

class SuccessActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySuccessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivitySuccessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKembali.setOnClickListener {
            Intent(this,MainActivity::class.java).run { startActivity(this) }
            finishAffinity()
        }
    }
}