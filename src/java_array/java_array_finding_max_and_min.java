package java_array;

import java.util.Scanner;

public class java_array_finding_max_and_min {

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

        // Finding max
        double maxNumber = numbers[0];

        for (int i = 1; i < arraySize; i++) {

            if (numbers[i] > maxNumber) {

                maxNumber = numbers[i];

            }

        }

        System.out.println("Maximum number in array : " + maxNumber);

        // Finding min
        double minNumber = numbers[0];

        for (int i = 1; i < arraySize; i++) {

            if (minNumber > numbers[i]) {

                minNumber = numbers[i];

            }

        }

        System.out.println("Minimum number in array : " + minNumber);

    }

}
