package com.example.roomdatabase_046.view.route

import com.example.roomdatabase_046.R


object DestinasiEditSiswa: DestinasiNavigasi {

    override val route = "item_edit"

    override val titleRes = R.string.edit_siswa

    const val itemIdArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"
}
