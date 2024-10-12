package com.pro.spring;

import java.time.LocalDateTime;

import com.pro.spring.controller.UserController;
import com.pro.spring.service.UserService;
import com.pro.spring.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pro.spring.entity.UserEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
//    public static void main(String[] args) {
//        SpringApplication.run(JpaApplication.class, args);
//
//        EntityManagerFactory entityManagerFactory = Persistence
//                .createEntityManagerFactory("basicjpa");
//        EntityManager entManager = entityManagerFactory.createEntityManager();
//
//        EntityTransaction entityTransaction = entManager.getTransaction();
//
//        try {
//            entityTransaction.begin();
//
//            UserEntity userEntity = new UserEntity("1", "2", LocalDateTime.now(),
//                    LocalDateTime.now());
//            entManager.persist(userEntity);
//            entityTransaction.commit();
//        } catch (Exception e) {
//            // TODO: handle exception
//            e.printStackTrace();
//            entityTransaction.rollback();
//        } finally {
//            entManager.close();
//        }
//        entityManagerFactory.close();
//
//    }

}
