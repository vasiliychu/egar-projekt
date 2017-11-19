package com.model.au;

/**
 *   The User class contains variable declaration fields
 *
 * @author Vasiliy
 * @version 1.0
 */
public class User {
    public String name;
    public String password;

    public User(String name, String password) { //создаем конструктор для вызова переменных
        this.name = name;
        this.password = password;
    }
}
