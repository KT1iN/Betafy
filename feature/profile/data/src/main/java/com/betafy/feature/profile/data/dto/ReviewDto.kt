package com.betafy.feature.profile.data.dto

import com.google.firebase.database.Exclude

data class ReviewDto(
    @get:Exclude var id: String = "",
    var matchId: String = "",
    var authorId: String = "",
    var recipientId: String = "",
    var rating: Int = 0,
    var comment: String = ""
)
