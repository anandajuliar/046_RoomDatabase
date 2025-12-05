package com.example.roomdatabase_046.view.route

import com.example.roomdatabase_046.R

object DestinasiDetailSiswa {
    object DestinasiDetailSiswa : DestinasiNavigasi {
        override val route = "detail_siswa"
        override val titleRes = R.string.detail_siswa
        const val itemIdArg = "idSiswa"
        val routeWithArgs = "$route/{$itemIdArg}"
    }
}