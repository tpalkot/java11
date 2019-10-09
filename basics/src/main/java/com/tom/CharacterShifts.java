package com.tom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterShifts {

    public static void main(String[] args) {


        String[] input = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};

        System.out.println(input[0].charAt(0));

        Map<Integer, List<String>> positionToDifference = new HashMap<>();

        for (int i = 0; i < input.length; i++) {

            char[] currentChars = input[i].toCharArray();

            int numberToGetToNext = currentChars.length > 1 ? currentChars[1] - currentChars[0] : 0;

            if (positionToDifference.containsKey(numberToGetToNext)) {
                positionToDifference.get(numberToGetToNext).add(input[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(input[i]);
                positionToDifference.put(numberToGetToNext, list);
            }

        }

        // positionToDifference.forEach((difference, listing) -> System.out.println(listing));


        System.out.println("Second solution:");
        System.out.println(groupStrings(input));
    }

    public static List<List<String>> groupStrings(String[] problemInput) {
        Map<String, List<String>> mapOfCharDiffToOccurrences = new HashMap<>();

        for (String sampleString : problemInput) {
            String characterGapPattern = calculateCharGapPattern(sampleString);
            List<String> listOfCharacterGapMatches = mapOfCharDiffToOccurrences
                    .getOrDefault(characterGapPattern, new ArrayList<>());
            listOfCharacterGapMatches.add(sampleString);
            mapOfCharDiffToOccurrences.put(characterGapPattern, listOfCharacterGapMatches);
        }
        return new ArrayList<>(mapOfCharDiffToOccurrences.values());
    }

    private static final int MAX_LOWERCASE_SHIFT = 'z' - 'a' + 1;
    //this could be anything but a lowercase letter
    private static final String charGapPatternDelimiter = ";";

    private static String calculateCharGapPattern(String charSequence) {
        char[] chars = charSequence.toCharArray();
        String key = "";
        for (int i = 1; i < chars.length; i++) {
            int diff = chars[i] - chars[i - 1];

            if (diff < 0) {
                // bring the key back to a valid lowercase char value
                key += MAX_LOWERCASE_SHIFT - Math.abs(diff);
            } else {
                key += diff;
            }

            key += charGapPatternDelimiter;
        }
        System.out.println(key);
        return key;
    }


}
