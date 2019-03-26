package com.tom.nestedclasses;

/**
 * Instance of the outer class not required
 * to create an instance of the static inner class
 * 
 * @author tom
 *
 */
public class StaticInnerClassExample {

    public static class Calculator {

        int add(int... numbers) {
            int sum = 0;
            for (int i : numbers) {
                sum += i;
            }
            return sum;
        }
    }

    public static void main(String... args) {

        // or = new StaticInnerClassExample.Calculator();
        StaticInnerClassExample.Calculator calc = new Calculator();

        System.out.println(calc.add(5, 4));
    }
}
