package com.tom.resourcebundle;

import java.util.ListResourceBundle;

public class MyResourceBundle extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        Object[][] result = {
                {"MovieName", "Avatar"},
                {"GrossRevenue", (Long) 2782275172L}, // in US dollars
                {"Year", (Integer) 2009}
        };
        return result;
    }
}