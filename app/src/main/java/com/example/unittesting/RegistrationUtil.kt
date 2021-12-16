package com.example.unittesting

object RegistrationUtil {

    fun validateRegistration(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) return false
        if (password != confirmPassword) return false
        return true
    }
}