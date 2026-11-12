package com.example.prak9.room

import android.content.Context
import androidx.room.RoomDatabase
import androidx.room3.Database
import kotlin.time.Instant

@Database(entities = [Siswa::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa : RoomDatabase(){
    abstract fun siswaDao() : SiswaDao

    companion object {
        @Volatile
        private var Instance: DatavaseSiswa? = null

        fun getDatabase(context: Context): DatabaseSiswa {

        }
    }
}