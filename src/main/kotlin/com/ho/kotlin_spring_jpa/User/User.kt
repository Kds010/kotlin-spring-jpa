package com.ho.kotlin_spring_jpa.User

import jakarta.persistence.*

@Entity
@Table(name="Users")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0;

}