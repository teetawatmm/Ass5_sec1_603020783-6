package com.example.ass5

import android.os.Parcelable
import android.widget.RadioGroup
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee(val name:String, val email:String, val gender: String, val salary: String) : Parcelable {
}