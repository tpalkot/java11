package com.tom.nestedclasses;

import java.util.HashMap;
import java.util.Map;

public class AnonymousClassExample {

    public static void main(String... args) {
        
        // inner class that overrides the empty constructor
        Map<String, String> simpleMap = new HashMap<>() {
            {
                put("name", "frank");
                put("age", "20");
            }
        };
        System.out.println(simpleMap);

        new Runnable() {

            @Override
            public void run() {
                System.out.println("I'm running!");

            }
        }.run();

    }

}
