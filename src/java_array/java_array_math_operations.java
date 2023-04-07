package java_array;

import java.util.Scanner;

public class java_array_math_operations {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Defining matrix size by user
        System.out.print("Number of rows for matrix : ");
        int matrixRow = userInput.nextInt();
        System.out.print("Number of column for matrix : ");
        int matrixColumn = userInput.nextInt();

        // Creating matrix's
        int[][] matrixOne = new int[matrixRow][matrixColumn];
        int[][] matrixTwo = new int[matrixRow][matrixColumn];

        // Assigning values in matrixOne
        System.out.println("\n");
        for (int row = 0; row < matrixRow; row++) {

            for (int column = 0; column < matrixColumn; column++) {

                System.out.printf("MatrixOne[%d][%d] : ", row, column);
                matrixOne[row][column] = userInput.nextInt();

            }

        }

        // Displaying matrixOne
        System.out.println("\n\nMatrix One\n");
        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {

                System.out.print(matrixOne[row][col] + " ");

            }

            System.out.println();

        }

        // Assigning values in matrixTwo
        System.out.println("\n");
        for (int row = 0; row < matrixRow; row++) {

            for (int column = 0; column < matrixColumn; column++) {

                System.out.printf("MatrixOne[%d][%d] : ", row, column);
                matrixTwo[row][column] = userInput.nextInt();

            }

        }

        // Displaying matrixTwo
        System.out.println("\n\nMatrix Two\n");
        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {

                System.out.print(matrixTwo[row][col] + " ");

            }

            System.out.println();

        }

        // Creating matrixThree
        int[][] matrixThree = new int[matrixRow][matrixColumn];

        // Assigning values in matrixTwo
        System.out.println("\n");
        for (int row = 0; row < matrixRow; row++) {

            for (int column = 0; column < matrixColumn; column++) {

                matrixThree[row][column] = matrixOne[row][column] + matrixTwo[row][column];

            }

        }

        // Displaying matrixTwo
        System.out.println("\n\nMatrix Three\n");
        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {

                System.out.print(matrixThree[row][col] + " ");

            }

            System.out.println();

        }

    }

}
