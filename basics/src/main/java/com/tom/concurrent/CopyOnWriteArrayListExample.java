package com.tom.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {


    public static void main(String[] args) {

        CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();

        cowal.add("one");
        cowal.add("two");
        cowal.add("three");
        Iterator<String> iter = cowal.iterator();
        
        cowal.add("four");
        cowal.add("five");
        
        // this only prints one two three because the iterator points at the original
        // array, and add creates a new underlying array.
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
