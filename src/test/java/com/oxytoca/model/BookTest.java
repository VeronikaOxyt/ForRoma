package com.oxytoca.model;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookTest {
    @Test
    public void create() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JavaSchool");
        EntityManager manager = entityManagerFactory.createEntityManager();

        Book book = new Book();
        book.setName("Java");
        manager.persist(book);
    }
}
