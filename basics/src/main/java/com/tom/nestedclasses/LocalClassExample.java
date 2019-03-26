package com.tom.nestedclasses;

public class LocalClassExample {

    public int calculate(int... numbers) {

        // method variable can be referenced in the class
        // before jdk 8 this needed to be final to be referenced
        // inside an inner class. Now it must be "effectively final"
        int extraNumber = 7;

        class Calculator {

            // Static is not allowed if not final
            public static final String message = "Bye bye";

            int add(int... numbers) {

                int sum = 0;
                for (int i : numbers) {
                    sum += i;
                }
                // reference parent method variable
                return sum + extraNumber;
            }
        }
        Calculator calc = new Calculator();
        int result = calc.add(numbers);
        return result;
    }

    public static void main(String[] args) {

        // Calculator is not visible

        int sum = new LocalClassExample().calculate(5,4);
        
        System.out.println(sum);
    }
}
