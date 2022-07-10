package com.xolary.singleactivity.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contact(
    val firstName: String,
    val lastName: String,
    @DrawableRes val avatarResourceId: Int
): Parcelable