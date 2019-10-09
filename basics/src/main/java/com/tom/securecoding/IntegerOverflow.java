package com.tom.securecoding;

public class IntegerOverflow {

    public static void main(String[] args) {
        // this overflows:

        int result = Integer.MAX_VALUE + 50;

        System.out.printf("Max plus 50 is %d%n", result);

        int resultBounded = Math.addExact(Integer.MAX_VALUE, 50);

        System.out.println(resultBounded);

    }

}
