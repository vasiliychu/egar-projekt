package com.view.au;

import com.controller.au.LotBD;

import java.io.IOException;

public class MenuLot {
    /**
     * Class implements selection of the menu of lots
     *
     * @author Vasiliy
     * @version 1.0
     * This class run menu lot
     */
    public void menuLot() throws IOException {

        char choice; //реализация метода, метод принимает значение choice
        do {
            System.out.println("Просмотр список лотов по категории:");
            System.out.println(" 1. Все категории");
            System.out.println(" 2. Компьюетеры");
            System.out.println(" 3. Телефоны");
            System.out.println(" 4. Ручки\n");
            System.out.println("Выберите пункт меню:");

            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
                LotBD lotBD = new LotBD();
                lotBD.LotBD();;
                break;
            case '2':
//                LotController controller = new LotController();
//                controller.updateView();;
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
