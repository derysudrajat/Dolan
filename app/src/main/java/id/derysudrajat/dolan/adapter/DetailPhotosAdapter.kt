package id.derysudrajat.dolan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import id.derysudrajat.dolan.R
import id.derysudrajat.dolan.databinding.ItemPhotoBinding

class DetailPhotosAdapter(
    val context: Context,
    private val listPhotos: MutableList<String>
) : RecyclerView.Adapter<DetailPhotosAdapter.DetailPhotosViewHolder>() {
    private lateinit var binding: ItemPhotoBinding

    class DetailPhotosViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailPhotosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)
        binding = ItemPhotoBinding.bind(view)
        return DetailPhotosViewHolder(
            view
        )
    }

    override fun getItemCount(): Int = listPhotos.size

    override fun onBindViewHolder(holder: DetailPhotosViewHolder, position: Int) {
        binding.ivPhoto.load(listPhotos[position]) { crossfade(true) }
    }
}