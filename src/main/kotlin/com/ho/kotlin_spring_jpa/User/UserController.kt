package com.ho.kotlin_spring_jpa.User

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping("/")
    fun hello() = "Hello, World~!!!~!~~~";
}