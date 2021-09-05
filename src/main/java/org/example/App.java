package org.example;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //variable declaraction
        int currentYear = 2021;

        System.out.println("\nWhat is your current age? "); //output #1
        Scanner ageInput = new Scanner(System.in); //scan for user's current age
        int age = ageInput.nextInt();

        System.out.println("\nAt what age would you like to retire? "); //output #2
        Scanner retirementAgeInput = new Scanner(System.in); //scan for retirement age
        int retirementAge = retirementAgeInput.nextInt();

        int ageDifference = retirementAge - age; //finding the difference of the two ages
        System.out.println("\nYou have " + ageDifference + " years left until you retire.");

        int retirementYear = currentYear + ageDifference; //finding retirement year
        System.out.println("It's 2021, so you can retire in " + retirementYear + ".");

    }
}