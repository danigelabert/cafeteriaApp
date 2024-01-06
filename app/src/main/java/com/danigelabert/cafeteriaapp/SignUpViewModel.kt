package com.danigelabert.cafeteriaapp

import androidx.lifecycle.ViewModel

class SignUpViewModel: ViewModel() {

    private var _user=""
    val user: String
        get() = _user


    private var _password=""
    val password: String
        get() = _password


    fun register(username: String, password: String){
        UserProvider.addUser(username, password)
    }


}