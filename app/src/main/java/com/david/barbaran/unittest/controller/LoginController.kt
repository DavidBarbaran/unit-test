package com.david.barbaran.unittest.controller

interface LoginController {
    fun onLoginSuccessful()
    fun onLoginFailed(message  :String)
}