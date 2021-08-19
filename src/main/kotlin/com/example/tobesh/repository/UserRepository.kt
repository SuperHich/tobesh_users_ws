package com.example.tobesh.repository

import User
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, String> {

    @Query("select * from USERS order by FIRST_NAME")
    fun fetchUsers() : List<User>

    @Query("select * from USERS where ID=:userId")
    fun getUserById(userId: String) : User
}