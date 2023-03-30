// find factorial of n

package java_core;

import java.util.Scanner;

public class java_assignment_factorial {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int userEnteredNumber = userInput.nextInt();
        int factorial = 1;

        for (int i = userEnteredNumber; i > 0; i--) {

            factorial = factorial * i;

        }

        System.out.println("Factorial of " + userEnteredNumber + " : " + factorial);

    }

}
