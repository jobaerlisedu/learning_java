package java_core;

import java.util.Scanner;

public class java_assignment_sum_of_odd_numbers {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int m, n, i, resSum = 0;

        System.out.print("Enter the m number : ");
        m = userInput.nextInt();

        System.out.print("Enter the n number : ");
        n = userInput.nextInt();

        for (i = m; i <= n; i++) {

            if (i % 2 != 0) {

                resSum = resSum + i;

            }

        }

        System.out.println("The sum odd numbers between " + m + " to " + n + " : " + resSum);

    }

}
