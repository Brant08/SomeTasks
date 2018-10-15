package com.test;

import com.repository.UserEntityManagerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        UserEntityManagerRepository entityManagerRepository = applicationContext.getBean("userEntityManagerRepository", UserEntityManagerRepository.class);
        entityManagerRepository.printAllUserInfo();
        entityManagerRepository.printAllUserInfo2();
        entityManagerRepository.printUsersByName("name1");

    }
}
