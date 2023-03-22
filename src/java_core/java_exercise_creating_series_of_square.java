package java_core;

import java.util.Scanner;

public class java_exercise_creating_series_of_square {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int firstNumber, lastNumber, i, seriesSum = 1;

        System.out.print("Enter the first number of the series : ");
        firstNumber = userInput.nextInt();

        System.out.print("Enter the last number of the series : ");
        lastNumber = userInput.nextInt();

        for (i = firstNumber; i <= lastNumber; i++) {

            System.out.print(i*i + " ");
            seriesSum = seriesSum + i*i;

        }

        System.out.println("\nThe sum of square series between " + firstNumber + " to " + lastNumber + " : " + seriesSum);
    }

}
