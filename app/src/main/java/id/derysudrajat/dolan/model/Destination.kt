package id.derysudrajat.dolan.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Destination(
    val name: String? = null,
    val desc: String? = null,
    val place: String? = null,
    val region: Int? = null,
    val rating: Float? = null,
    val bannerPhoto: String? = null,
    val photos: MutableList<String>? = null
) : Parcelable