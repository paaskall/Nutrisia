package com.example.nutrisia

data class LoginData(
    // Fields for request
    val username: String,
    val password: String,

    // Fields for response
    val status: String? = null,
    val message: String? = null,
    val token: String? = null // Optional token for authentication
)
