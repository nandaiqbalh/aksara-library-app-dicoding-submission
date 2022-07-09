package com.nandaiqbalh.aksaralibrary.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Book (
    var title: String? = "",
    var desc: String? = "",
    var author: String? = "",
    var publisher: String? = "",
    var category: String? = "",
    var language: String? = "",
    var pages: String? = "",
    var poster: Int?,

):Parcelable