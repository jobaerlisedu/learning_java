package java_core;

import java.util.Scanner;

public class java_exercise_even_odd {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int userInputNumber = userInput.nextInt();

        if (userInputNumber % 2 == 0) {

            System.out.println("You have entered a even number.");

        } else {

            System.out.println("You have entered a odd number.");

        }
    }
}
