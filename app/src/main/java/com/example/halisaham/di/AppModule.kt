package com.example.halisaham.di

import android.app.Application
import androidx.room.Room
import com.example.halisaham.service.ReservationDao
import com.example.halisaham.service.ReservationDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application) : ReservationDatabase {
        return Room.databaseBuilder(application, ReservationDatabase::class.java,"reservation.db")
            .build()
    }

    @Provides
    fun provideReservationDao(database: ReservationDatabase) : ReservationDao {
        return  database.reservationDao()
    }



}