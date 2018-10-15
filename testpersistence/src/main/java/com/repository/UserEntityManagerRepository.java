package com.repository;

import com.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Repository("userEntityManagerRepository")
@Transactional
public class UserEntityManagerRepository {

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void printAllUserInfo(){
//        EntityTransaction transaction = entityManager.getTransaction();
        Query query = entityManager.createQuery("select u from UserEntity u");
        List<UserEntity> userEntityList = query.getResultList();
        for(UserEntity userEntity : userEntityList) {
            System.out.println(userEntity);
        }
//        transaction.commit();
    }

    public void printUsersByName(String name){
        List<UserEntity> userEntityList = userRepository.findByName(name);
        for(UserEntity userEntity : userEntityList) {
            System.out.println(userEntity);
        }
    }
    public void printAllUserInfo2(){
        List<UserEntity> userEntityList = userRepository.findAll();
        for(UserEntity userEntity : userEntityList) {
            System.out.println(userEntity);
        }
    }
}
