package com.example.roomdatabasetutorial.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.roomdatabasetutorial.model.User


@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

    @Update
    suspend fun updateUser(user:User)

    //SQL Command to sort data
    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>

    //
}