package java_core;

import java.util.Scanner;

public class java_exercise_fibonacci_series {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int num, firstNumber = 0, secondNumber = 1;

        System.out.print("Enter a positive number : ");
        num = userInput.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i <= 2) {

                System.out.print(i - 1 + " ");

            } else {

                int fibonacci = firstNumber + secondNumber;
                System.out.print(fibonacci + " ");
                firstNumber = secondNumber;
                secondNumber = fibonacci;

            }

        }

    }

}
