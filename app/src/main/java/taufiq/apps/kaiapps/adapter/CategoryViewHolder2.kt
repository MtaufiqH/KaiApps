package taufiq.apps.kaiapps.adapter

import androidx.recyclerview.widget.RecyclerView
import coil.load
import taufiq.apps.kaiapps.data.DataCategory
import taufiq.apps.kaiapps.databinding.RowItemCategory2Binding

/**
 * Created By Taufiq on 3/2/2021.
 *
 */
class CategoryViewHolder2(val binding:  RowItemCategory2Binding): RecyclerView.ViewHolder(binding.root) {

    fun bindItem2(data: DataCategory, listener: (DataCategory) -> Unit){
        binding.apply {
            tvCategory2.text = data.title
            ivCategory2.run { data.icon?.let { setImageResource(it) } }
            itemCategory.setOnClickListener { listener(data) }
        }
    }
}