package com.view.au;

import com.model.au.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * The user's authorization class
 *
 * @author Vasiliy
 * @version 1.0
 *
 * */
public class UserView {

    public void userView() {

        List<User> users = new ArrayList<>();
        users.add(new User("Admin", "123"));
        users.add(new User("User", "456"));

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Введите Login : ");
        String name = myScanner.next();

        System.out.print("Введите Password : ");
        String surname = myScanner.next();

        boolean isFound = false;
        for (User user : users) {
            if (user.name.equals(name) && user.password.equals(surname)) {
                isFound = true;
                //System.out.println("Найден " + user.name + " " + user.password);Menu menu = new Menu();
                Menu menu = new Menu();
                try {
                    menu.Menu();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (!isFound) System.out.println("Пользователь не найден.");
    }
}
