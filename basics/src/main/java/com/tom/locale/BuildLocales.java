package com.tom.locale;

import java.util.Locale;

public class BuildLocales {

    public static void main(String[] args) {
        Locale locale = new Locale("en", "US", "");
        printLocaleDetails(locale);

        locale = Locale.forLanguageTag("en");
        printLocaleDetails(locale);

        locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        printLocaleDetails(locale);


        locale = Locale.US;
        printLocaleDetails(locale);
    }

    public static void printLocaleDetails(Locale locale) {
        System.out.printf("Locale is %s %n", locale.getDisplayName());
    }
}
