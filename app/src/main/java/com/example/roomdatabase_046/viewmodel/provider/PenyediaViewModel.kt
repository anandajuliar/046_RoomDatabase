package com.example.roomdatabase_046.viewmodel.provider

import android.app.Application
import androidx.lifecycle. ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel. CreationExtras
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.roomdatabase_046.repositori. AplikasiSiswa
import com.example.roomdatabase_046.viewmodel.DetailViewModel
import com.example.roomdatabase_046.viewmodel. EntryViewModel
import com.example.roomdatabase_046.viewmodel. HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {

        // Initializer untuk HomeViewModel
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        // Initializer untuk EntryViewModel
        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            DetailViewModel(
                savedStateHandle = this.createSavedStateHandle(),
                repositoriSiswa = aplikasiSiswa().container.repositoriSiswa)
        }


    }
}

/**
 * Fungsi ekstensi query untuk objek [Application] dan mengembalikan sebuah
 * instance dari [AplikasiSiswa].
 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)
