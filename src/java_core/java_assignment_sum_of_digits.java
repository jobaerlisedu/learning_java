package java_core;

import java.util.Scanner;

public class java_assignment_sum_of_digits {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number limit : ");
        int digitLimit = userInput.nextInt();

        int i, res = 0;

        for (i = 1; i <= digitLimit; i++) {

            res += i;

        }

        System.out.println("The sum of 1 to " + digitLimit + " : " + res);

    }

}
