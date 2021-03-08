package taufiq.apps.kaiapps.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

/**
 * Created By Taufiq on 3/2/2021.
 *
 */
@Parcelize
data class DataTerbaru(
    val imageItem: String,
    val tanggal: String,
    val itemName: String,
    @DrawableRes val status: Int,
    val category: String,
    val merk: String = " - ",
    val warna: String,
    val deskripsi: String
) : Parcelable
