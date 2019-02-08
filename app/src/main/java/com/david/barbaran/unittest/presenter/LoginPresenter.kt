package com.david.barbaran.unittest.presenter

import com.david.barbaran.unittest.controller.LoginController

class LoginPresenter {

    lateinit var controller : LoginController

    fun login(user: String, password: String): Boolean {

        if (user.isEmpty() || password.isEmpty()){
            controller.onLoginFailed("Debe completar los campos")
            return false
        }

        return if (user == "dev" && password == "123456"){
            controller.onLoginSuccessful()
            true
        } else {
            controller.onLoginFailed("Las credenciales son erroneas")
            false
        }
    }
}