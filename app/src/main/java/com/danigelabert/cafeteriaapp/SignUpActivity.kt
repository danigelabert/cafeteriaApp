package com.danigelabert.cafeteriaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity


class SignUpActivity : AppCompatActivity() {

    private val viewModel: SignUpViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val usernameEditText: EditText = findViewById(R.id.editTextRegisterUsername)
        val passwordEditText: EditText = findViewById(R.id.editTextRegisterPassword)
        val registerButton: Button = findViewById(R.id.buttonDoRegister)

        registerButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val contrasenya = passwordEditText.text.toString()

            viewModel.register(username, contrasenya)



            startActivity(Intent(this, LoginActivity::class.java))

        }
    }
}