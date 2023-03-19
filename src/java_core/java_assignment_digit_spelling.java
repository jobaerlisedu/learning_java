package java_core;

import java.util.Scanner;

public class java_assignment_digit_spelling {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a digit between 0-9 : ");
        int userEnteredDigit = userInput.nextInt();

        if (userEnteredDigit == 0) {

            System.out.println("Zero");

        } else if (userEnteredDigit == 1) {

            System.out.println("One");

        } else if (userEnteredDigit == 2) {

            System.out.println("Two");

        } else if (userEnteredDigit == 3) {

            System.out.println("Three");

        } else if (userEnteredDigit == 4) {

            System.out.println("Four");

        } else if (userEnteredDigit == 5) {

            System.out.println("Five");

        } else if (userEnteredDigit == 6) {

            System.out.println("Six");

        } else if (userEnteredDigit == 7) {

            System.out.println("Seven");

        } else if (userEnteredDigit == 8) {

            System.out.println("Eight");

        } else if (userEnteredDigit == 9) {

            System.out.println("Nine");

        } else {

            System.out.println("Invalid digit.");

        }
    }
}
