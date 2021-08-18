package com.example.tobesh.service

import User
import com.example.tobesh.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val db: UserRepository) {

    fun fetchUsers() : List<User> = db.fetchUsers()

    fun findUserById(userId: String) : User = db.getUserById(userId)

    fun post(user: User) {
        db.save(user)
    }
}