package com.tom.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ListResourceBundleExample {

    public static void main(String[] args) {
        ResourceBundle resourceBundle =
                ResourceBundle.getBundle("com.tom.resourcebundle.MyResourceBundle");

        print(resourceBundle);

        System.out.println(Locale.ITALIAN);
        resourceBundle =
                ResourceBundle.getBundle("com.tom.resourcebundle.MyResourceBundle", Locale.ITALIAN);

        print(resourceBundle);

        Locale locale2 = new Locale("en", "in");
        System.out.println(locale2);
    }

    public static void print(ResourceBundle resourceBundle) {
        
        System.out.printf("In %s they like the movie %s%n",
                resourceBundle.getLocale().getDisplayName(), resourceBundle.getString("MovieName"));
    }
}
