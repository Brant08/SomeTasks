package com.test;

import com.model.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class UserEntityManagerTest {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence.
                createEntityManagerFactory("NewPersistenceUnit").
                createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        Query query = entityManager.createQuery("select u from UserEntity u");
        List<UserEntity> userEntityList = query.getResultList();
        for(UserEntity userEntity : userEntityList) {
            System.out.println(userEntity);
        }
        transaction.commit();

    }
}
