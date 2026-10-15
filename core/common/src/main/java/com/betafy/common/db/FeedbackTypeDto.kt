package com.betafy.common.db

import com.google.firebase.database.Exclude

data class FeedbackTypeDto(
    @get:Exclude var id: String = "",
    var name: String = ""
)
