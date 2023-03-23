package java_core;

import java.util.Scanner;

public class java_exercise_multiplication_table {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table : ");
        int numberForMultiplicationTable = userInput.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(numberForMultiplicationTable + " x " + i + " = " + (numberForMultiplicationTable*i));

        }

    }

}
