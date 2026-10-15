package com.betafy.feature.profile.data.dto

import com.google.firebase.database.Exclude

data class WriterProfileDto(
    @get:Exclude var userId: String = "",
    var bio: String = "",
    var experienceLevel: String = "",
    var preferredLanguage: String = ""
)
