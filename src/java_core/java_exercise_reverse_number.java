package java_core;

import java.util.Scanner;

public class java_exercise_reverse_number {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int number, temp, r;

        System.out.print("Enter a positive number : ");
        number = userInput.nextInt();
        temp = number;

        while (temp != 0) {

            r = temp % 10;
            System.out.print(r);
            temp = temp / 10;

        }

    }

}
