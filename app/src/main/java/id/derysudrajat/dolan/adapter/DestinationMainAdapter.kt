package id.derysudrajat.dolan.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import id.derysudrajat.dolan.R
import id.derysudrajat.dolan.databinding.ItemDestinationBinding
import id.derysudrajat.dolan.model.Destination
import id.derysudrajat.dolan.ui.DetailDestinationActivity

class DestinationMainAdapter(
    val context: Context,
    val listDestination: MutableList<Destination>
) : RecyclerView.Adapter<DestinationMainAdapter.DestinationMainViewHolder>() {

    lateinit var binding: ItemDestinationBinding

    class DestinationMainViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationMainViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_destination, parent, false)
        binding = ItemDestinationBinding.bind(view)
        return DestinationMainViewHolder(
            view
        )
    }

    override fun getItemCount(): Int = listDestination.size

    override fun onBindViewHolder(holder: DestinationMainViewHolder, position: Int) {
        val data = listDestination[position]

        binding.apply {
            ivBanner.load(data.bannerPhoto) { crossfade(true) }
            tvName.text = data.name
            tvPlace.text = data.place
            ratingBar.rating = data.rating!!
            tvRating.text = data.rating.toString()
            tvDesc.text = data.desc
            contentMainDestination.setOnClickListener {
                val intent = Intent(context, DetailDestinationActivity::class.java)
                intent.putExtra(DetailDestinationActivity.DESTINATION_EXTRA, data)
                context.startActivity(intent)
            }
        }
    }
}