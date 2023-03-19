/*
 * valid voter program using if,else
 * step 1: ask for a person age
 * step 2: if age is equal or more than 18 than print valid voter
 * step 3: else print invalid voter
 */

package java_core;

import java.util.Scanner;

public class java_assignment_valid_voter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int voterAge = userInput.nextInt();

        if (voterAge >= 18) {

            System.out.print("Valid voter.");

        } else {

            System.out.println("Invalid voter.");

        }
    }
}
