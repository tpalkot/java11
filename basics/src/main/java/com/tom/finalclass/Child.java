package com.tom.finalclass;

// make this final, and Parent breaks
public class Child {

    // make this final, parent breaks
    public String getName() {
        return "Child";
    }

    int getAge() {
        return 10;
    }

}
