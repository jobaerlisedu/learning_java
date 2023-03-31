package java_core;

import java.util.Scanner;

public class java_exercise_prime_series {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int firstNumber, secondNumber, count = 0, temp = 0;

        System.out.print("Enter the first number : ");
        firstNumber = userInput.nextInt();

        System.out.print("Enter the second number : ");
        secondNumber = userInput.nextInt();

        for (int i = firstNumber; i < secondNumber; i++) {

            if (i == 0 || i == 1) {

                continue;

            } else {

                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {

                        temp++;
                        break;

                    }

                }

                if (temp == 0) {

                    count++;

                }

                temp = 0;

            }

        }

        System.out.println("Total prime number : " + count);

    }

}
