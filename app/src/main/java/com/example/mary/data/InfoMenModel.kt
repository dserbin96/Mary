package com.example.mary.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class InfoMenModel(
    val title: String,
    val name: String,
    val homePhone: String,
    val workPhone: String,
    val status: String,
    val department: String
) : Parcelable