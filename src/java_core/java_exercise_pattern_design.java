package java_core;

import java.util.Scanner;

public class java_exercise_pattern_design {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a positive number : ");
        int patternLimit = userInput.nextInt();


        for (int row = 1; row <= patternLimit; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print("*");

            }

            System.out.println();

        }

        for (int row = patternLimit; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

}
