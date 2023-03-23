package java_core;

import java.util.Scanner;

public class java_exercise_fibonacci_series {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int firstNumber = 0, secondNumber = 1, seriesRange, i;

        System.out.print("Enter the range of the series : ");
        seriesRange = userInput.nextInt();

        for(i = 1; i <= seriesRange; i++){

            if (i <= 2) {

                System.out.print((i-1) + " ");

            } else {

                int fibo =  firstNumber + secondNumber;
                System.out.print(fibo + " ");

                firstNumber = secondNumber;
                secondNumber = fibo;

            }

        }

    }

}
