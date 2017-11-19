package com.view.au;

import java.util.List;

public class LotView {
    public void printLotInfo(List lotType) {
        for (Object v : lotType) {

            System.out.println("Name: " + v);
        }
    }
}

