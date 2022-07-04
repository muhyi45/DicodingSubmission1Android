package com.dicoding.githubuserapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hero(
    var name: String,
    var username: String,
    var follower: String,
    var following: String,
    var company: String,
    var location: String,
    var repository: String,
    var photo: Int
) : Parcelable