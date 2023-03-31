package java_core;

import java.util.Scanner;

public class java_exercise_prime_number {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a positive : ");
        int num = userInput.nextInt();
        int temp = 0;

        if (num == 0 || num == 1) {

            System.out.println(num + " is not a prime number.");

        } else {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {

                    temp++;

                }

            }

            if (temp == 0) {

                System.out.println(num + " is a prime number.");

            } else {

                System.out.println(num + " is not a prime number.");

            }

        }

    }

}
