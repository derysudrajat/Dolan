package id.derysudrajat.dolan.model

import android.os.Parcelable
import id.derysudrajat.dolan.model.Destination
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Region(
    val banner: String? = null,
    val title: String? = null,
    val region: Int? = null,
    val ratingAve: Float? = null,
    val place: String? = null,
    val listDestination: MutableList<Destination>? = null
) : Parcelable