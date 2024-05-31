package com.capstonehore.ngelana.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    val name: String,
    val image: String
) : Parcelable