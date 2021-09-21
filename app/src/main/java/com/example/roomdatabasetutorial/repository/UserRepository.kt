package com.example.roomdatabasetutorial.repository

import androidx.lifecycle.LiveData
import com.example.roomdatabasetutorial.data.UserDao
import com.example.roomdatabasetutorial.model.User

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

}