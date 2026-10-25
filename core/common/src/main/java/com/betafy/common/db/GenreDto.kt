package com.betafy.common.db

import com.google.firebase.database.Exclude

data class GenreDto(
    @get:Exclude var id: String = "",
    var name: String = ""
)
