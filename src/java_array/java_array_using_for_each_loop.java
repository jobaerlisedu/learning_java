package java_array;

import java.util.Scanner;

public class java_array_using_for_each_loop {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Defining array sizes
        System.out.print("Enter the size of array : ");
        int arraySize = userInput.nextInt();

        // Creating array
        double[] numbers = new double[arraySize];

        // Assigning values in array using for loop
        for (int i = 0; i < arraySize; i++) {

            System.out.printf("number[%d] : ", i);
            numbers[i] = userInput.nextDouble();

        }

        // Let's print array elements using for each loop
        System.out.print("Array : ");
        for (double i : numbers) {

            System.out.print(i + " ");

        }

    }

}
