package java_core;

import java.util.Scanner;

public class java_exercise_factorial_number {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int numberEnteredByUser = userInput.nextInt();

        int i, facRes = 1;
        for (i = 1; i <= numberEnteredByUser; i++) {

            facRes = facRes * i;

        }

        System.out.println("Factorial of " + numberEnteredByUser + " : " + facRes);

    }

}
