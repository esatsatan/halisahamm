package com.example.halisaham.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.halisaham.model.Reservation

@Dao
interface ReservationDao {

    @Insert
    suspend fun addData(vararg reservation: Reservation)

    @Query("SELECT * FROM reservation")
    suspend fun getAllReservations() : List<Reservation>

    @Query("DELETE FROM reservation")
    suspend fun deleteAllReservation()

}