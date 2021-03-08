package taufiq.apps.kaiapps.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import coil.load
import taufiq.apps.kaiapps.data.DataCategory
import taufiq.apps.kaiapps.databinding.RowItemCategoryBinding

/**
 * Created By Taufiq on 3/2/2021.
 *
 */
class CategoryViewHolder(private val binding: RowItemCategoryBinding): RecyclerView.ViewHolder(binding.root) {

    fun bindItem(data: DataCategory,listener: (DataCategory) -> Unit){
        binding.apply {
            tvCategory.text = data.title
            ivCategory.load(data.image)
            itemCategory1.setOnClickListener { listener(data) }
        }
    }
}