package taufiq.apps.kaiapps.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import taufiq.apps.kaiapps.data.DataCategory
import taufiq.apps.kaiapps.databinding.RowItemCategory2Binding
import taufiq.apps.kaiapps.databinding.RowItemCategoryBinding

/**
 * Created By Taufiq on 3/2/2021.
 *
 */
class CategoryAdapter(
    private val context: Context,
    private val data: List<DataCategory>,
    private val listener: (DataCategory) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val VIEW_TYPE_ONE = 1
        const val VIEW_TYPE_TWO = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_ONE) {
            CategoryViewHolder(
                RowItemCategoryBinding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    false
                )
            )
        } else {
            CategoryViewHolder2(
                RowItemCategory2Binding.inflate(
                    LayoutInflater.from(context),
                    parent,
                    false
                )
            )
        }
    }

    override fun getItemViewType(position: Int) = data[position].viewType

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (data[position].viewType == VIEW_TYPE_ONE) {
            (holder as CategoryViewHolder).bindItem(data[position], listener)
        } else {
            (holder as CategoryViewHolder2).bindItem2(data[position], listener)
        }
    }

    override fun getItemCount() = data.size
}
