package com.danigelabert.cafeteriaapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    val _user = MutableLiveData<User>()
//    val user: LiveData<User> = _user


    fun login(name: String, pwd: String) {
        _user.value = User(name, pwd)
    }

}