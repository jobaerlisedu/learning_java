package java_core;

import java.util.Scanner;

public class java_exercise_area_of_triangle_and_circle {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // creating variables to store data
        double triangleBase, triangleHeight, area_of_triangle, circleRadius, pi = 3.1415, area_of_circle;

        // taking the base and height of the triangle from user
        System.out.print("Enter the base of the triangle : ");
        triangleBase = userInput.nextDouble();

        System.out.print("Enter the height of the triangle : ");
        triangleHeight = userInput.nextDouble();

        // calculating the area of triangle and printing the result
        area_of_triangle = 0.5 * triangleBase * triangleHeight;
        System.out.println("The area of the triangle : " + area_of_triangle);

        // taking the radius of the circle from user
        System.out.print("Enter the radius of the circle : ");
        circleRadius = userInput.nextDouble();

        // calculating the area of circle and printing the result
        area_of_circle = pi * (circleRadius * circleRadius);
        System.out.println("The area of the circle : " + area_of_circle);
    }
}
