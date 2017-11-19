package com;

import com.model.au.LotModel;

import java.util.ArrayList;
import java.util.List;

public class MyBD {

    public static void lotBD() {
        List arrLot = new ArrayList();

        arrLot.add("Lot №1: ");
        arrLot.add("Lot №2: ");
        arrLot.add("Lot №3: ");
        arrLot.add("Lot №4: ");
        arrLot.add("Lot №5: ");

        LotModel lotMain = new LotModel();
        lotMain.setTypeLot(arrLot);
    }
}
