package com.example.moneyapp


data class UserBody(
    val username: String,
    val type: String,
    val saldo: Int,
    val password: String)