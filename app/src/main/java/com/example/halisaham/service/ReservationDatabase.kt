package com.example.halisaham.service

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.halisaham.model.Reservation

@Database(entities = [Reservation::class], version = 1)
abstract class ReservationDatabase : RoomDatabase() {

    abstract  fun reservationDao() : ReservationDao

}