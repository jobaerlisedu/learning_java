package java_array;

import java.util.Scanner;

public class java_math_operations_with_array {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double[] numbers = new double[5];
        double sum = 0;

        System.out.print("Enter five number : ");

        for (int i = 0; i < 5; i++) {

            numbers[i] = userInput.nextDouble();

        }

        // finding sum of array elements
        for (int i = 0; i < 5; i++) {

            sum = sum + numbers[i];

        }

        System.out.println("The sum of array elements : " + sum);

        // finding average of array elements
        double average = sum / numbers.length;
        System.out.println("The average of array elements : " + average);

    }

}
