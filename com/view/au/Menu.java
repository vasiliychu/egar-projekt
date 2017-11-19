package com.view.au;

import com.controller.au.RateBD;

import java.io.IOException;

class Menu {
    /**
     * Start class of the main menu
     *
     * @author Vasiliy
     * @version 1.0
     */
    public void Menu() throws IOException {

        char choice; //реализация метода, метод принимает значение choice
        do {
            System.out.println("Информация для пользоателя:");
            System.out.println(" 1. Просмотр списка лотов по категории");
            System.out.println(" 2. Просмотр список ставок по лоту");
            System.out.println(" 3. Просмотреть список своих лотов и ставок по ним");
            System.out.println(" 4. Просмотерть статистику по лотам\n");

            System.out.println("Выберите пункт меню:");

            choice = (char) System.in.read();   //место воода значения от пользователя
        } while (choice < '1' || choice > '5'); //цикл для проверки условия воодимого значения
        System.out.println("\n");

        //Используем оператор switch для составления меню

        switch (choice) {
            case '1':
                MenuLot menuLotRun = new MenuLot();
                menuLotRun.menuLot();
                break;
            case '2':
                RateBD rateBD = new RateBD();
                rateBD.RateBD();
                break;
            case '3':
                System.out.println("\n");
                break;
            case '4':
                System.out.println("\n");
                break;
        }
    }
}