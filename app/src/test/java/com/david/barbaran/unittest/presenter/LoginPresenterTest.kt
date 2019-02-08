package com.david.barbaran.unittest.presenter

import com.david.barbaran.unittest.controller.LoginController
import org.junit.Test

import org.junit.Assert.*
import java.lang.Exception
import org.junit.Before


class LoginPresenterTest {

    lateinit var presenter: LoginPresenter

    @Before
    @Throws(Exception::class)
    fun setUp() {
        presenter = LoginPresenter()
        presenter.controller = object : LoginController {
            override fun onLoginSuccessful() {

            }

            override fun onLoginFailed(message: String) {

            }
        }
    }

    @Test
    @Throws(Exception::class)
    fun login() {
        var result: Boolean = presenter.login("dev", "123456")
        assertEquals("B1", true, result)
    }
}