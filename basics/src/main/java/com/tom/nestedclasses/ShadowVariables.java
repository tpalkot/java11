package com.tom.nestedclasses;

// recommended to not serialize inner classes
public class ShadowVariables {

    String foo = "classLevel";

    class InnerShadowVariables {
        String foo = "innerClassLevel";

        void printValues(String foo) {
            System.out.println("local foo " + foo);
            System.out.println("innerClassLevel foo " + this.foo);
            System.out.println("classLevel foo " + ShadowVariables.this.foo);
        }
    }

    public static void main(String... args) {
        new ShadowVariables().new InnerShadowVariables().printValues("bar");
    }

}
