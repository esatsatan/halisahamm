package com.example.halisaham.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Reservation(
    @ColumnInfo(name = "id")
    val reservationId : String?,
    @ColumnInfo(name = "name")
    val reservationName : String?,
    @ColumnInfo(name = "date")
    val reservationDate : String?,
    @ColumnInfo(name = "description")
    val reservationDescription : String?
) {
    @PrimaryKey(autoGenerate = true)
    var uuid : Int = 0
}