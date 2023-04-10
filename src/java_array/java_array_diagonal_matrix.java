package java_array;

import java.util.Scanner;

public class java_array_diagonal_matrix {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int sumOfDiagonalElements = 0;
        int sumOfUpperElements = 0;
        int sumOfLowerElements = 0;

        // Assigning values
        for (int row = 0; row < 3; row++) {

            for (int column = 0; column < 3; column++) {

                System.out.printf("MatrixOne[%d][%d] : ", row, column);
                matrix[row][column] = userInput.nextInt();

            }

        }

        // Calculating diagonal, upper and lower elements
        for (int row = 0; row < 3; row++) {

            for (int column = 0; column < 3; column++) {

                if (row == column) {

                    sumOfDiagonalElements = sumOfDiagonalElements + matrix[row][column];

                }

                if (row > column) {

                    sumOfUpperElements = sumOfUpperElements + matrix[row][column];

                }

                if (row < column) {

                    sumOfLowerElements = sumOfLowerElements + matrix[row][column];

                }

            }

        }

        System.out.println("Sum of diagonal elements : " + sumOfDiagonalElements);
        System.out.println("Sum of upper elements : " + sumOfUpperElements);
        System.out.println("Sum of lower elements : " + sumOfLowerElements);

    }

}
