package com.betafy.feature.profile.data.dto

import com.google.firebase.database.Exclude

data class WorkDto(
    @get:Exclude var id: String = "",
    var writerId: String = "",
    var title: String = "",
    var description: String = "",
    var wordCount: Int = 0,
    var language: String = "",
    var status: String = "",
    var createdAt: Long = 0L
)
