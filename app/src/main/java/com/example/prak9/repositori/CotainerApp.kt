package com.example.prak9.repositori

import com.example.prak9.room.DatabaseSiswa

interface CotainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}