package com.tom.io;

import java.util.Scanner;

public class Read {

    public static void main(String[] args) {
        System.out.println("Please type a number: ");
        String userNumber = "0";
        try (Scanner scanner = new Scanner(System.in)) {
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //
            // userNumber = br.readLine();

            userNumber = scanner.next();

        }

        System.out.println("YOu entered " + userNumber);
    }

}
