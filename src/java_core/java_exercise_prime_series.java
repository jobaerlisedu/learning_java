package java_core;

import java.util.Scanner;

public class java_exercise_prime_series {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int firstNumber, lastNumber, counter = 0, i, j;

        System.out.print("Enter the first number of the series : ");
        firstNumber = userInput.nextInt();

        System.out.print("Enter the last number of the series : ");
        lastNumber = userInput.nextInt();

        for(i = firstNumber; i <= lastNumber; i++) {

            if (i == 0 || i == 1) {

                continue;

            } else {

                for (j = 2; j < i; j++) {

                    if(i % j == 0) {

                        counter++;
                        break;

                    }

                }

                if(counter == 0){

                    System.out.println(i);

                }

                counter = 0;

            }

        }

    }

}
