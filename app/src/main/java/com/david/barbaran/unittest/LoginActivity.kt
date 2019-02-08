package com.david.barbaran.unittest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.david.barbaran.unittest.activity.HomeActivity
import com.david.barbaran.unittest.controller.LoginController
import com.david.barbaran.unittest.presenter.LoginPresenter
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginController {

    var presenter = LoginPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginButton.setOnClickListener {
            presenter.login(userEdit.text.toString(), passwordEdit.text.toString())
        }
    }

    override fun onLoginSuccessful() {
        startActivity(Intent(this, HomeActivity::class.java))
    }

    override fun onLoginFailed(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}