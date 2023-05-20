package java_array;

import java.util.Arrays;
import java.util.Scanner;

public class java_array_sorting {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // creating array
        System.out.print("Number of array elements : ");
        int arrayElements = userInput.nextInt();

        int[] numbers = new int[arrayElements];

        for (int i = 0; i < arrayElements; i++) {

            System.out.printf("numbers[%d] : ", i);
            numbers[i] = userInput.nextInt();

        }

        System.out.print("Before sorting : ");
        for (int i = 0; i < arrayElements; i++) {

            System.out.print(numbers[i] + " ");

        }

        // sorting array in ascending
        System.out.print("\nAfter sorting in ascending : ");
        Arrays.sort(numbers);
        for (int i = 0; i < arrayElements; i++) {

            System.out.print(numbers[i] + " ");

        }

        // sorting array in descending
        System.out.print("\nAfter sorting in descending : ");
        for (int i = (arrayElements - 1); i >= 0; i--) {

            System.out.print(numbers[i] + " ");

        }

    }

}
