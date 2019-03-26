package com.tom.nestedclasses;

public class InnerClassExample {

    public class Calculator {
        
        int add(int... numbers) {
            int sum = 0;
            for (int i : numbers) {
                sum += i;
            }
            return sum;
        }
    }

    public static void main(String... args) {
        InnerClassExample ice = new InnerClassExample();

        InnerClassExample.Calculator calc = ice.new Calculator();

        System.out.println(calc.add(5, 4));

        // example of calling static
        StaticInnerClassExample.Calculator calcStatic = new StaticInnerClassExample.Calculator();
        System.out.println(calcStatic.add(5, 4, 1));
    }
}
