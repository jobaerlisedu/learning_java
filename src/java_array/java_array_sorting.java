package java_array;

import java.util.Scanner;
import java.util.Arrays;

public class java_array_sorting {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int[] number = new int[5];

        // Assigning values in number array
        for (int i = 0; i < 5; i++) {

            System.out.printf("number[%d] : ", i);
            number[i] = userInput.nextInt();

        }

        // Sorting the array
        Arrays.sort(number);

        // Displaying sorted array - ascending order
        System.out.print("\nIn ascending order :");
        for (int i : number) {

            System.out.print(" " + i);

        }

        // Displaying sorted array - descending order
        System.out.print("\nIn descending order :");
        for (int i = number.length - 1; i >= 0; i--) {

            System.out.print(" " + number[i]);

        }

    }

}
