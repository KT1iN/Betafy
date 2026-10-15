package com.betafy.feature.profile.data.dto

import com.google.firebase.database.Exclude
import com.google.firebase.database.PropertyName

data class BetaReaderProfileDto(
    @get:Exclude var userId: String = "",
    var bio: String = "",
    var experienceLevel: String = "",
    var preferredLanguage: String = "",
    var maxWordCount: Int = 0,
    @get:PropertyName("isAvailable") @set:PropertyName("isAvailable")
    var isAvailable: Boolean = false,
    var cooperationType: String = "",
    var price: Double = 0.0
)
