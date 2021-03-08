package taufiq.apps.kaiapps.view

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import taufiq.apps.kaiapps.R
import taufiq.apps.kaiapps.adapter.CategoryAdapter
import taufiq.apps.kaiapps.adapter.CategoryItemImage
import taufiq.apps.kaiapps.adapter.Status
import taufiq.apps.kaiapps.adapter.TerbaruAdapter
import taufiq.apps.kaiapps.data.DataCategory
import taufiq.apps.kaiapps.data.DataTerbaru
import taufiq.apps.kaiapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val data = ArrayList<DataCategory>()
    private val dataTerbaru = ArrayList<DataTerbaru>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setDataCategory()
        setDataTerbaru()

        binding.rvKategori.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvKategori.adapter = CategoryAdapter(this, data) { category ->
            Toast.makeText(this, "coming soon", Toast.LENGTH_SHORT).show()
        }

        binding.rvItemTerbaru.layoutManager = GridLayoutManager(this, 2)
        binding.rvItemTerbaru.adapter = TerbaruAdapter(this, dataTerbaru) { terbaru ->
            Intent(this, DetailActivity::class.java).run {
                putExtra(EXTRA_DETAIL, terbaru)
                startActivity(this)
            }
        }
    }

    private fun setDataCategory() {
        data.add(
            DataCategory(
                CategoryAdapter.VIEW_TYPE_ONE, "Elektronik", CategoryItemImage.ELECTRONIC
            )
        )
        data.add(
            DataCategory(
                CategoryAdapter.VIEW_TYPE_ONE, "Tas & Dompet", CategoryItemImage.BAG
            )
        )
        data.add(
            DataCategory(CategoryAdapter.VIEW_TYPE_ONE, "Perhiasan", CategoryItemImage.JEWERLY),
        )

        data.add(
            DataCategory(
                CategoryAdapter.VIEW_TYPE_TWO,
                "Lainnya",
                icon = R.drawable.ic_category_icon
            )
        )
    }

    private fun setDataTerbaru() {
        dataTerbaru.add(
            DataTerbaru(
                "https://www.windsorsmith.com.au/media/wysiwyg/00WINDSORSMITH/Home_Blocks/2021/2_LAWRENCE_JAN_2021.jpg",
                "20 Desember 2020",
                "Sepatu Australia",
                Status.HILANG,
                "Sepatu",
                "-",
                "Hitam",
                "Sepatu Australia ditemukan hilang gerbang stasiun."
            )
        )

        dataTerbaru.add(
            DataTerbaru(
                "https://dtpmhvbsmffsz.cloudfront.net/posts/2016/09/01/57c83f2bbcd4a7e80200a85e/m_57c83f2bbcd4a7e80200a85f.jpg",
                "15 Januari 2021",
                "Sepatu Sneakers",
                Status.HILANG,
                "Sepatu",
                "All stars",
                "Hitam",
                "Ditemukan sepatu sneakers terletak di kursi tunggu stasiun."
            )
        )

        dataTerbaru.add(
            DataTerbaru(
                "https://image.made-in-china.com/2f0j00YqZRhIFnMScs/New-Lamborghini-Sian-Licensed-Kids-Electric-Ride-on-Car-Toys.jpg",
                "17 Januari 2021",
                "Mobil-mobilan",
                Status.HILANG,
                "Mainan",
                " - ",
                "Kuning",
                "Ditemukan mainan mobil-mobilan warna kuning di lantai stasiun."
            )
        )

        dataTerbaru.add(
            DataTerbaru(
                "https://p.globalsources.com/IMAGES/PDT/BIG/485/B1159557485.jpg",
                "28 Januari 2021",
                "Motoran mainan",
                Status.DITEMUKAN,
                "Mainan",
                "-",
                "Merah",
                "ditemukan mainan berwarna merah pada jam 16.00 di kursi tunggu."
            )
        )

        dataTerbaru.add(
            DataTerbaru(
                "https://www.jakmall.com/blog/content/images/size/w2000/2020/08/computer-accessories-computers-memory-card-pb-Feature.jpg",
                "1 Februari 2021",
                "Flashdisk",
                Status.DITEMUKAN,
                "Elektronik",
                "Toshiba",
                "putih",
                "Ditemukan flashdisk berwarna putih. "
            )
        )

        dataTerbaru.add(
            DataTerbaru(
                "https://dl.kaskus.id/4.bp.blogspot.com/-K2F8ws5yy-Y/UQ4YSnHnfBI/AAAAAAAAGeg/7mnNRdbUycE/s400/nifty_homemade_chinese_invention_640_04.jpg",
                "2 Februari 2021",
                "Flash Disk Hijau",
                Status.DITEMUKAN,
                "Elektronik",
                "-",
                "Hijau",
                "Ditemukan flashdisk tanpa pembungkus di meja registrasi tiket."
            )
        )

        dataTerbaru.add(
            DataTerbaru(
                "https://i.pcmag.com/imagery/reviews/01s5k5DIbwRr89opTJW7C5O-1..1614178272.jpg",
                "4 Februari 2021",
                "Mouse gaming",
                Status.HILANG,
                "Elektronik",
                "-",
                "Hitam",
                "di Lantai stasiun ditemukan mouse gaming berwarna hitam."
            )
        )

        dataTerbaru.add(
            DataTerbaru(
                "https://5.imimg.com/data5/TF/LT/AE/ANDROID-10902806/product-jpeg-500x500.jpg",
                "4 Februari 2021",
                "Tas Sekolah AT",
                Status.HILANG,
                "Tas",
                "American Tourister",
                "Merah",
                "Tas Sekolah AT di sekitaran stasiun."
            )
        )

        dataTerbaru.add(
            DataTerbaru(
                "https://cdn.cnn.com/cnnnext/dam/assets/210226133221-corsair-dark-core-rgb-pro-wireless-gaming-mouse-live-video.jpg",
                "15 Februari 2021",
                "Mouse Wireless",
                Status.DITEMUKAN,
                "Elektronik",
                "-",
                "Hitam",
                "Mouse wireless gaming berwarna hitam ditemukan di kursi kereta. "
            )
        )

        dataTerbaru.add(
            DataTerbaru(
                "https://asababusinessonline.com/wp-content/uploads/2020/09/spider-man-school-bag.jpeg",
                "20 Februari 2021",
                "Tas warna biru",
                Status.HILANG,
                "Tas",
                "-",
                "Biru",
                "Ditemukan tas sekolah berwarna biru dengan gambar spider-man di sekitaran ruang tunggu stasiun."
            )
        )

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.aboutFragment){
            Intent(this,AboutActivity::class.java).run { startActivity(this) }
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
    }
}


