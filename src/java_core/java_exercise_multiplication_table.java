package java_core;

import java.util.Scanner;

public class java_exercise_multiplication_table {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a positive number for multiplication table : ");
        int num = userInput.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " X " + i + " = " + (num * i));

        }

    }

}
