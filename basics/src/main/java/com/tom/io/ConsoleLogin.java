package com.tom.io;

import java.io.Console;

public class ConsoleLogin {

    public static void main(String[] args) {

        Console console = System.console();

        String userName = null;
        char[] password = null;

        userName = console.readLine("Please enter your username %n");

        password = console.readPassword("Please enter your password %n");

        if (userName.equals("Frank") && "secret".equals(new String(password))) {
            console.printf("Correct password %n");
        } else {
            console.printf("InCorrect username/password %1$s/%2$s %n", userName,
                    new String(password));
        }
    }

}
