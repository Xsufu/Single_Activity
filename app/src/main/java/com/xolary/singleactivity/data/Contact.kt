package com.xolary.singleactivity.data

import androidx.annotation.DrawableRes

data class Contact(
    val firstName: String,
    val lastName: String,
    @DrawableRes val avatarResourceId: Int
)