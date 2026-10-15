package com.betafy.feature.chats.data.dto

import com.google.firebase.database.Exclude

data class ChatDto(
    @get:Exclude var id: String = "",
    var matchId: String = "",
    var createdAt: Long = 0L
)
