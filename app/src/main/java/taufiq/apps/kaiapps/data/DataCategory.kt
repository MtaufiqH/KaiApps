package taufiq.apps.kaiapps.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created By Taufiq on 3/2/2021.
 *
 */
@Parcelize
data class DataCategory(
    val viewType: Int,
    val title: String,
    val image: String? = null,
    val icon: Int? = null
) : Parcelable
