package com.example.tobesh.controller

import User
import com.example.tobesh.service.UserService
import org.springframework.web.bind.annotation.*


@RestController
class UserResource(val service: UserService) {

    @GetMapping(path = ["/users"])
    fun index() : List<User> = service.fetchUsers()

    @GetMapping(path = ["user/{userId}"])
    fun find(@PathVariable userId: String) : User = service.findUserById(userId)

    @PostMapping(path = ["/add_user"])
    fun post(@RequestBody user: User) {
        service.post(user)
    }
}