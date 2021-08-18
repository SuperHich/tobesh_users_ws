package com.example.tobesh

import User
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository


@SpringBootApplication
class TobeshApplication

fun main(args: Array<String>) {
    runApplication<TobeshApplication>(*args)
}

interface UserRepository : CrudRepository<User, String> {

    @Query("select * from users")
    fun fetchUsers() : List<User>

    @Query("select * from USERS where ID=:userId")
    fun getUserById(userId: String) : User
}