package com.tom.locale;

import java.util.Arrays;
import java.util.Locale;

public class AvailableLocalse {

    public static void main(String[] args) {
        // Display the available locales and their display name
        
        Locale[] locales = Locale.getAvailableLocales();
        
        Arrays.stream(locales).filter(locale -> locale.getLanguage().equals("en"))
                .forEach(locale ->
        System.out.printf("Locale is %s with a display name of %s %n", locale,
                locale.getDisplayName()));

    }

}
