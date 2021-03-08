package taufiq.apps.kaiapps.adapter

import androidx.recyclerview.widget.RecyclerView
import coil.load
import taufiq.apps.kaiapps.data.DataTerbaru
import taufiq.apps.kaiapps.databinding.RowItemTerbaruBinding

/**
 * Created By Taufiq on 3/2/2021.
 *
 */
class TerbaruViewHolder(private val binding: RowItemTerbaruBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bindItem(dataTerbaru: DataTerbaru, listener: (DataTerbaru) -> Unit) {
        binding.apply {
            ivItem.load(dataTerbaru.imageItem)
            tvTanggal.text = dataTerbaru.tanggal
            tvItem.text = dataTerbaru.itemName
            ivStatus.setImageResource(dataTerbaru.status)

            itemTerbaru.setOnClickListener { listener(dataTerbaru) }
        }
    }
}