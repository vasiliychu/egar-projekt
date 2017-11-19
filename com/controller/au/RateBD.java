package com.controller.au;
import java.util.HashMap;
import java.util.Map;
/**
 * In this class, bids for lots are announced
 *
 * @author Vasiliy
 * @version 1.0
 * */
public class RateBD {
    public void RateBD() {
        Map<String, String> mapRate = new HashMap<String, String>();
        mapRate.put("Rate1", "10");
        mapRate.put("Rate2", "20");
        mapRate.put("Rate3", "30");
        mapRate.put("Rate4", "40");
        mapRate.put("Rate5", "50");

        for (String v : mapRate.values()) { //вывод всех значений коллекции
            System.out.println(v);
        }
    }
}