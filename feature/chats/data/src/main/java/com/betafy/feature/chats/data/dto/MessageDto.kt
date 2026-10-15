package com.betafy.feature.chats.data.dto

import com.google.firebase.database.Exclude
import com.google.firebase.database.PropertyName

data class MessageDto(
    @get:Exclude var id: String = "",
    var chatId: String = "",
    var senderId: String = "",
    var text: String = "",
    var sentAt: Long = 0L,
    @get:PropertyName("isRead") @set:PropertyName("isRead")
    var isRead: Boolean = false
)
