package com.tom.interfaces;

public class DefaultMethodInterfaces {

    interface Actor {
        // example of Java8 static method on an interface
        public static int add(int... numbers) {
            int sum = 0;
            for (int i : numbers) {
                sum += i;
            }
            return sum;
        }

        // default method from Java8
        default String act() {
            return "I'm famous";
        }
    }

    public static void main(String... args) {

        Actor boringActor = new Actor() {

        };
        
        Actor fancyActor = new Actor() {
            public String act() {
                return "I'm fancy!";
            }
        };

        System.out.println(boringActor.act());
        System.out.println(fancyActor.act());


    }
}
