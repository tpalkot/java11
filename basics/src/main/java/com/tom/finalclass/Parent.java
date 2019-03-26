package com.tom.finalclass;

public class Parent extends Child {

    @Override
    public String getName() {

        return "Parent of " + super.getName();
    }

    int getAge() {
        return 30;
    }
}
