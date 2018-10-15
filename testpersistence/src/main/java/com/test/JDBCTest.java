package com.test;

import com.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

public class JDBCTest {
    public static void main(String[] args) throws Exception {
        JDBCTest.class.forName("org.h2.Driver");
        String userName = "sa";
        String password = "sa";
        String url = "jdbc:h2:file:/Users/tasha/Downloads/test_users_db";
        Connection connection = DriverManager.getConnection(url, userName, password);

        PreparedStatement statement = connection.prepareStatement("select * from user");
        ResultSet resultSet =
                statement.executeQuery();

        Set<User> users = new HashSet<User>();
        while(resultSet.next()){
            String format = String.format("name %s; surname %s",
                    resultSet.getString(2), resultSet.getString(3));

            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String surName = resultSet.getString(3);
            User user = new User(id, name, surName);
            users.add(user);
            System.out.println(format);
        }
        System.out.println(users);

    }
}
