package com.tom.resourcebundle;

import java.util.ListResourceBundle;

public class MyResourceBundle_it extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        Object[][] result = {
                {"MovieName", "Che Bella Giornata"},
                {"GrossRevenue", (Long) 43000000L}, // in euros
                {"Year", (Integer) 2011}
        };
        return result;
    }
}