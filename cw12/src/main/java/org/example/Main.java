package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("default")) {

            try (EntityManager em = emf.createEntityManager()) {

//                User user = em.find(User.class, 1L);
//                System.out.println(user.getMobileNumbers());

            }

        }

    }
}