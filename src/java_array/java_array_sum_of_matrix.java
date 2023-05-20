package java_array;

import java.util.Scanner;

public class java_array_sum_of_matrix {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // defining matrix size
        int rowNumber, colNumber;

        System.out.print("Enter the number of rows : ");
        rowNumber = userInput.nextInt();

        System.out.print("Enter the number of columns : ");
        colNumber = userInput.nextInt();

        // defining matrix
        int[][] matrix_one = new int[rowNumber][colNumber];
        int[][] matrix_two = new int[rowNumber][colNumber];
        int[][] matrix_sum = new int[rowNumber][colNumber];

        // assigning values to matrix_one
        System.out.println("\nmatrix_one:");
        for (int row = 0; row < rowNumber; row++) {

            for (int col = 0; col < colNumber; col++) {

                System.out.printf("matrix_one[%d][%d] : ", row, col);
                matrix_one[row][col] = userInput.nextInt();

            }

        }

        // assigning values to matrix_two
        System.out.println("\nmatrix_two:");
        for (int row = 0; row < rowNumber; row++) {

            for (int col = 0; col < colNumber; col++) {

                System.out.printf("matrix_two[%d][%d] : ", row, col);
                matrix_two[row][col] = userInput.nextInt();

            }

        }

        // printing matrix_one
        System.out.println("\nmatrix_one:");
        for (int row = 0; row < rowNumber; row++) {

            for (int col = 0; col < colNumber; col++) {

                System.out.print(matrix_one[row][col] + " ");

            }

            System.out.println();

        }

        // printing matrix_two
        System.out.println("\nmatrix_two:");
        for (int row = 0; row < rowNumber; row++) {

            for (int col = 0; col < colNumber; col++) {

                System.out.print(matrix_two[row][col] + " ");

            }

            System.out.println();

        }

        // sum of matrix_one & matrix_two elements
        for (int row = 0; row < rowNumber; row++) {

            for (int col = 0; col < colNumber; col++) {

                matrix_sum[row][col] = matrix_one[row][col] + matrix_two[row][col];

            }

        }

        // printing matrix_sum
        System.out.println("\nmatrix_sum:");
        for (int row = 0; row < rowNumber; row++) {

            for (int col = 0; col < colNumber; col++) {

                System.out.print(matrix_sum[row][col] + " ");

            }

            System.out.println();

        }

    }

}
