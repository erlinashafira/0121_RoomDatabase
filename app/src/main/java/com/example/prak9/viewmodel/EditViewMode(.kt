package com.example.prak9.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.savedstate.SavedState
import com.example.prak9.repositori.OfflineRepositoriSiswa
import com.example.prak9.repositori.RepositoriSiswa
import com.example.prak9.uicontroller.DestinasiDetailSiswa
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class EditViewMode(
    savedState: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa): ViewModel(){

    var uiStateSiswa by mutableStateOf(UIStateSiswa())

    private val idSiswa: Int = checkNotNull(SavedStateHandle[DestinasiDetailSiswa.itemIdArg])
        init{
            viewModelScope.launch {
                uiStateSiswa = repositoriSiswa.getSiswaStream(idSiswa)
                    .filterNotNull()
                    .first()
                    .toUiStateSiswa(true)
            }
        }
}