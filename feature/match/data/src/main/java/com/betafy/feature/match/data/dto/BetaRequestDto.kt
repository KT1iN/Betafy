package com.betafy.feature.match.data.dto

import com.google.firebase.database.Exclude

data class BetaRequestDto(
    @get:Exclude var id: String = "",
    var workId: String = "",
    var description: String = "",
    var deadline: String = "",
    var cooperationType: String = "",
    var status: String = ""
)
