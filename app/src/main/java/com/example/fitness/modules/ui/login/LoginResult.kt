package com.example.fitness.modules.ui.login

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
) {
    val accessToken: AccessToken = TODO("initialize me")

    class AccessToken {

        val token: String = TODO("initialize me")
    }
}