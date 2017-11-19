package com.controller.au;
import java.util.HashMap;
import java.util.Map;
/**
 * In this class there is a base with lots in the form of an intelected list map
 *
 * @author Vasiliy
 * @version 1.0 *
 * */
public class LotBD {
    public void LotBD() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Lot1", "Samsung");
        map.put("Lot2", "Nokia");
        map.put("Lot3", "LG");
        map.put("Lot4", "HTC");
        map.put("Lot5", "Apple");

        for (Map.Entry<String, String> e : map.entrySet()) { //вывод и ключей и значений
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}