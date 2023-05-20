package java_array;

import java.util.Scanner;

public class java_array_diagonal_matrix {

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

        // sum of diagonal elements (row == column)
        int sum_of_diagonal_elements = 0;

        for (int row = 0; row < rowNumber; row++) {

            for (int column = 0; column < colNumber; column++) {

                if (row == column) {

                    sum_of_diagonal_elements = sum_of_diagonal_elements + numbers[row][column];

                }

            }

        }

        System.out.println("sum of diagonal elements (row == column) : " + sum_of_diagonal_elements);

        // sum of upper diagonal elements (column > row)
        int sum_of_upper_diagonal_elements = 0;

        for (int row = 0; row < rowNumber; row++) {

            for (int column = 0; column < colNumber; column++) {

                if (column > row) {

                    sum_of_upper_diagonal_elements = sum_of_upper_diagonal_elements + numbers[row][column];

                }

            }

        }

        System.out.println("sum of upper diagonal elements (column > row) : " + sum_of_upper_diagonal_elements);

        // sum of lower diagonal elements (row > column)
        int sum_of_lower_diagonal_elements = 0;

        for (int row = 0; row < rowNumber; row++) {

            for (int column = 0; column < colNumber; column++) {

                if (row > column) {

                    sum_of_lower_diagonal_elements = sum_of_lower_diagonal_elements + numbers[row][column];

                }

            }

        }

        System.out.println("sum of lower diagonal elements (row > column) : " + sum_of_lower_diagonal_elements);

    }

}
