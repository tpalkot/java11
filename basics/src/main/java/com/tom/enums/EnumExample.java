package com.tom.enums;

public class EnumExample {

    public enum Colors {
        YELLOW, RED, BLUE;

        public String inReverse() {
            char[] nameChars = this.name().toCharArray();
            for (int i = 0; i < nameChars.length / 2; i++) {
                char temp = nameChars[nameChars.length - 1 - i];
                nameChars[nameChars.length - 1 - i] = nameChars[i];
                nameChars[i] = temp;
            }
            return new String(nameChars);
        }
    }

    public enum States {
        TEXAS("tx"), FLORIDA("fl");

        String abbrev;

        public String getAbbreviation() {
            return abbrev;
        }
        private States(String abbrev) {
            this.abbrev = abbrev;
        }

    }

    public static void main(String... args) {
        System.out.println(Colors.BLUE.inReverse());

        // convert a string to an enum
        String red = "RED";

        System.out.println(Colors.valueOf(red).inReverse());

        System.out.println(States.TEXAS.getAbbreviation());

    }
}
