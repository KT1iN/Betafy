package com.betafy.common.db

import com.google.firebase.database.Exclude
import com.google.firebase.database.PropertyName

data class NotificationDto(
    @get:Exclude var id: String = "",
    var userId: String = "",
    var type: String = "",
    var relatedEntityId: String? = null,
    var text: String = "",
    @get:PropertyName("isRead") @set:PropertyName("isRead")
    var isRead: Boolean = false
)
