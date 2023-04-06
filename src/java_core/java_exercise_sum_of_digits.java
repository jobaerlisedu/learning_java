package java_core;

import java.util.Scanner;

public class java_exercise_sum_of_digits {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int number, temp, r, sum = 0;

        System.out.print("Enter a positive number : ");
        number = userInput.nextInt();
        temp = number;

        while (temp != 0) {

            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;

        }

        System.out.println("Sum of digits : " + sum);

    }

}
