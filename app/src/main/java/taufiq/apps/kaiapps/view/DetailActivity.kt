package taufiq.apps.kaiapps.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import coil.load
import taufiq.apps.kaiapps.data.DataTerbaru
import taufiq.apps.kaiapps.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<DataTerbaru>(MainActivity.EXTRA_DETAIL)
        binding.apply {
            data?.let {
                ivDetail.load(it.imageItem)
                ivStatusDetail.setImageResource(it.status)
                tvNamaItemDetail.text = it.itemName
                tvDateItem.text = it.tanggal
                tvMerek.text = it.merk
                tvCategoryDetail.text = it.category
                tvWarna.text = it.warna
                tvDesc.text = it.deskripsi

                btnClaim.setOnClickListener {
                    Intent(this@DetailActivity,SuccessActivity::class.java).run {
                        startActivity(this)
                    }
                }
            }

        }

    }
}