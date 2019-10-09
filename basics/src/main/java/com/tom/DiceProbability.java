package com.tom;

public class DiceProbability {


    public static void main(String[] args) {

        double result = DiceProbability.calculateProbability(2, 5);

        System.out.println("probability is " + result);
    }

    public static double calculateProbability(int dice, int target) {

        int countMatches = 0;
        
        int[] counters = new int[dice];
        for (int i = 0; i < dice; i++) {
            counters[i] = 1;
        }
        int possibilities = 0;

        int positionToIncrement = dice - 1;
        int currentSum = 0;
        for (int currentDiceIndex = 0; currentDiceIndex < dice; currentDiceIndex++) {
            System.out.print(counters[currentDiceIndex]);
            currentSum += counters[currentDiceIndex];
            if (currentDiceIndex == dice - 1) {
                
                counters[positionToIncrement]++;
                if (counters[positionToIncrement] > 6) {                    
                    counters[positionToIncrement] = 1;
                    //now reduce your left guys if you can
                    for (int i = positionToIncrement - 1; i >= 0; i--) {
                        // reset the counter unless you are at the first position
                        // in which case you are done, so don't do anything.
                        if (counters[i] == 6 && i != 0) {
                            counters[i] = 1;
                            continue;
                        } else {
                            counters[i]++;
                            break;
                        }
                    }
                }
                currentDiceIndex = -1;

                System.out.println(" current sum is " + currentSum);
                possibilities++;
                if (currentSum == target) {
                    countMatches++;
                }
                currentSum = 0;
                // did you increment the first position past 6?
                if (counters[0] == 7) {
                    break;
                }
            }
            
        }
        System.out.println("count matches " + countMatches + " possibilities " + possibilities);


        return (double) countMatches / Math.pow(6, dice);
    }

}
