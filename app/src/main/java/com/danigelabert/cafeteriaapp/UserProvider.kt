package com.danigelabert.cafeteriaapp

class UserProvider {
    companion object{
        var position = 0

        fun login(username: String, password: String): Boolean {
            val user = userName.find { it.username == username && it.password == password }
            return user != null
        }

        fun addUser(username: String, password: String) {
            var nouUser = User(username, password)
            userName.add(username.length+1, nouUser)
        }



        val userName = mutableListOf<User>(
            User("Dani", "patata123"),
            User("Ruben",  "patata123"),
            User("Marc",  "patata123"),
            User("Pau",  "patata123"),
            User("Arnau", "patata123"),
            User("Aram", "patata123"),
            User("Alex", "patata123"),
        )
    }
}