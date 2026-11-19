package com.example.prak9.uicontroller

import androidx.compose.material3.R

object DestinasiEditSiswa : DestinasiNavigasi{
    override  val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg"
}