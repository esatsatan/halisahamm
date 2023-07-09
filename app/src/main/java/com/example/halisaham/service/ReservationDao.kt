package com.example.halisaham.service

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.halisaham.model.Reservation

@Dao
interface ReservationDao {

    @Insert
    suspend fun addData(reservation: Reservation)

    @Query("SELECT * FROM reservation")
    suspend fun getAllReservations() : List<Reservation>

    @Delete
    suspend fun deleteAllReservation(reservation: Reservation)

}