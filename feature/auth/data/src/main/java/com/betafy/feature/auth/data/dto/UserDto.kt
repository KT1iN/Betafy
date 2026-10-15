package com.betafy.feature.auth.data.dto

import com.google.firebase.database.Exclude

data class UserDto(
    @get:Exclude var id: String = "",
    var email: String = "",
    var username: String = "",
    var fullName: String = "",
    var avatarUrl: String = "",
    var createdAt: Long = 0L
)
