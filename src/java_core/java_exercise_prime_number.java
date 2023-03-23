package java_core;

import java.util.Scanner;

public class java_exercise_prime_number {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int checkPrimeNumber, counter;

        System.out.print("Enter any positive integer: ");
        checkPrimeNumber = userInput.nextInt();
        counter = 0;

        if (checkPrimeNumber == 0 || checkPrimeNumber == 1) {

            System.out.println(checkPrimeNumber + " is a not a prime");

        } else {

            for(int i = 2; i < checkPrimeNumber; i++){

                if(checkPrimeNumber % i == 0){

                    counter++;
                    break;

                }

            }

            if(counter == 0){

                System.out.println(checkPrimeNumber + " is a a prime");

            } else {

                System.out.println(checkPrimeNumber + " is a not a prime");

            }

        }

    }

}
