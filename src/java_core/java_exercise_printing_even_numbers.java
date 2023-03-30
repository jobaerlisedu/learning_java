package java_core;

import java.util.Scanner;

public class java_exercise_printing_even_numbers {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int m, n;

        System.out.print("Enter the m number : ");
        m = userInput.nextInt();

        System.out.print("Enter the n number : ");
        n = userInput.nextInt();

        for (int i = m; i <= n; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " ");

            }

        }

    }

}
