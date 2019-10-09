package com.tom.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {

    public static void main(String[] args) {
        

        ResourceBundle resourceBundle = ResourceBundle.getBundle("ResourceBundle", Locale.getDefault());
        
        System.out.printf("In the language %s we say %s", Locale.getDefault().getDisplayLanguage(),
                resourceBundle.getString("Greeting"));


    }

}
