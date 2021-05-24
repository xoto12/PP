package com.example.moneyapp

data class LoginResponse (
    var statusCode: Int,
    var authToken: String,
    var user: User
)