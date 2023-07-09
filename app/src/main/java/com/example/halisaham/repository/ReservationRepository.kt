package com.example.halisaham.repository

import com.example.halisaham.model.Reservation
import com.example.halisaham.service.ReservationDao
import javax.inject.Inject

class ReservationRepository @Inject constructor(
    private val reservationDao: ReservationDao
) {

    // veritabanı işlemleri
    suspend fun getAllReservations() : List<Reservation> {
        return reservationDao.getAllReservations()
    }

    suspend fun insertReservation(reservation: Reservation) {
        reservationDao.addData(reservation)
    }

    suspend fun deleteAllReservation(reservation: Reservation) {
        reservationDao.deleteAllReservation(reservation)
    }






}