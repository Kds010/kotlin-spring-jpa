package com.ho.kotlin_spring_jpa.jpaTest

import jakarta.persistence.EntityManager
import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence

class jpa {

    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("jpabook");
    val em: EntityManager = emf.createEntityManager();

    fun simpleClose(){
        em.close();
        emf.close();
    }
}