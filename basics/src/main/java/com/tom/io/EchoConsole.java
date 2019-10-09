package com.tom.io;

import java.io.Console;

public class EchoConsole {

    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.err.println("Can't get a console");
            System.exit(-1);
        }

        console.printf(console.readLine());

    }

}
