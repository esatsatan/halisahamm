package com.example.halisaham.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.example.halisaham.repository.ReservationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val reservationRepository: ReservationRepository
) : ViewModel() {

    var isDialogShown by mutableStateOf(false)
        private set

    fun onBuyClick() {
        isDialogShown = false

    }
    fun onDismissDialog() {
        isDialogShown = false
    }





}