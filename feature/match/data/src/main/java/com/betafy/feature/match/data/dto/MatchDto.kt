package com.betafy.feature.match.data.dto

import com.google.firebase.database.Exclude

data class MatchDto(
    @get:Exclude var id: String = "",
    var requestId: String = "",
    var readerId: String = "",
    var compatibilityScore: Double = 0.0,
    var initiatorId: String = "",
    var status: String = "",
    var createdAt: Long = 0L,
    var respondedAt: Long? = null
)
