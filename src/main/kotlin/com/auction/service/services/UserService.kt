package com.auction.service.services

import com.auction.service.entities.User
import org.springframework.stereotype.Service

@Service
class UserService {
    fun createUser(): User {
        return User().apply{
            username = "darren"
            address = "jurong"
            password = "password"
            age = 20
        }
    }
}