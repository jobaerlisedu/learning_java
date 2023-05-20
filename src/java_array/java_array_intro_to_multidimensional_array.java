package java_array;

import java.util.Scanner;

public class java_array_intro_to_multidimensional_array {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // defining array size by user
        int rowNumber, colNumber;

        System.out.print("Enter the number of rows : ");
        rowNumber = userInput.nextInt();

        System.out.print("Enter the number of columns : ");
        colNumber = userInput.nextInt();

        // defining array
        int[][] numbers = new int[rowNumber][colNumber];

        // assigning values in array
        for (int row = 0; row < rowNumber; row++) {

            for (int column = 0; column < colNumber; column++) {

                System.out.printf("Value for numbers[%d][%d] : ", row, column);
                numbers[row][column] = userInput.nextInt();

            }

        }

        // printing multi-dimensional array
        for (int row = 0; row < rowNumber; row++) {

            for (int column = 0; column < colNumber; column++) {

                System.out.print(numbers[row][column] + " ");

            }

            System.out.println();

        }

    }

}
