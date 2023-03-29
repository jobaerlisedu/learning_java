package java_core;

import java.util.Scanner;

public class java_assignment_fibonacci_series {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int firstNumber = 0, secondNumber = 1, seriesRange;

        System.out.print("Enter the limit of the series : ");
        seriesRange = userInput.nextInt();

        for (int i = 1; i <= seriesRange; i++) {

            if (i <= 2) {

                System.out.print((i - 1) + " ");

            } else {

                int fibonacciNumber = firstNumber + secondNumber;
                System.out.print(fibonacciNumber + " ");
                firstNumber = secondNumber;
                secondNumber = fibonacciNumber;

            }

        }

    }

}
