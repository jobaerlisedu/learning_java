package java_core;

import java.util.Scanner;

public class java_exercise_palindrome_number {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int number, temp, r, sum = 0;

        System.out.print("Enter a positive number : ");
        number = userInput.nextInt();
        temp = number;

        while (temp != 0) {

            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }

        if (sum == number) {

            System.out.println(number + " is a palindrome number.");

        } else {

            System.out.println(number + " is not a palindrome number.");

        }

    }

}
