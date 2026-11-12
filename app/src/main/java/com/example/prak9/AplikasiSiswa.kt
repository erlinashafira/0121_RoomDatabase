package com.example.prak9

import android.app.Application
import com.example.prak9.repositori.ContainerApp
import com.example.prak9.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}