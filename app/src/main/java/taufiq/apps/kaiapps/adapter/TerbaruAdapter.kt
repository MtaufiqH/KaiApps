package taufiq.apps.kaiapps.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import taufiq.apps.kaiapps.data.DataTerbaru
import taufiq.apps.kaiapps.databinding.RowItemTerbaruBinding

/**
 * Created By Taufiq on 3/2/2021.
 *
 */
class TerbaruAdapter(
    val context: Context,
    private val data: List<DataTerbaru>,
    private val listener: (DataTerbaru) -> Unit
) : RecyclerView.Adapter<TerbaruViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TerbaruViewHolder {
        return TerbaruViewHolder(RowItemTerbaruBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: TerbaruViewHolder, position: Int) {
        holder.bindItem(data[position], listener)
    }

    override fun getItemCount() = data.size
}