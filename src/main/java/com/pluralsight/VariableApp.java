package com.pluralsight;

import java.lang.String;

public class VariableApp {
    public static void main(String[] args) {

        // Step 1: assign variables
        String color = "red";
        int year = 2026;
        char middleInitial = 'D';
        boolean hasPets = true;
        String say = "According to all known laws of aviation, there is no way a bee should be able to fly.";

        // Step 2: declare and initialize
        int week = 7;
        String coffeePrice = "$4.99";
        char favLetter = 'T';
        boolean rain = true;

        // print
        System.out.println("In the year " + year + ", a " + color + " bee with the initial " + middleInitial + " said, \"" + say + "\" It's " + hasPets + " that it has pets, and every " + week + " weeks it spends " + coffeePrice + " on its favorite coffee while thinking of the letter " + favLetter + ", even if it is " + rain + " outside.");

    }

}
