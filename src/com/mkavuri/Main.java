package com.mkavuri;

import java.util.HashMap;
import java.util.Map;

public class Main
{

    public static void main(String[] args)
    {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach((k,v) -> System.out.println("Key :" +k +" , Value :"+v));
        items.forEach((k,v) -> System.out.println("This Key :"+k));
    }
}
