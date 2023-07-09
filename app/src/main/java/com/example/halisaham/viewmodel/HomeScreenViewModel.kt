package com.example.halisaham.viewmodel

import androidx.lifecycle.ViewModel
import com.example.halisaham.repository.ReservationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val reservationRepository: ReservationRepository
) : ViewModel() {



}