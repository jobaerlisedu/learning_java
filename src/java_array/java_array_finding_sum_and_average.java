package java_array;

import java.util.Scanner;

public class java_array_finding_sum_and_average {

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

        // Calculating the sum of array elements
        double sum = 0;
        for (int i = 0; i < arraySize; i++) {

            sum = sum + numbers[i];

        }

        System.out.println("Sum of array elements : " + sum);

        // Calculating the average of array elements
        double average = sum / arraySize;
        System.out.println("Average of array elements : " + average);

    }

}
