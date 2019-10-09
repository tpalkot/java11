package com.tom.typeinference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class TypeInference {

    public static void main(String[] args) throws FileNotFoundException {
        var x = 5;

        var myMap = new HashMap<>();
        myMap.put(42, "The Answer");

        // can't reassign a new instance for a var
        // myMap = new ArrayList<String>();


        var inputStream = new FileInputStream(".gitignore");

        try {
            try (inputStream) {

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
