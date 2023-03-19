package java_core;

import java.util.Scanner;

public class java_exercise_temperature_conversion {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double tempFahrenheit, tempCelsius, convFahrenheit, convCelsius;

        System.out.print("Enter the temperature in fahrenheit : ");
        tempFahrenheit = userInput.nextDouble();

        convCelsius = (tempFahrenheit - 32) * 5/9;
        System.out.println("Temperature in celsius : " + convCelsius);

        System.out.print("Enter the temperature in celsius : ");
        tempCelsius = userInput.nextDouble();

        convFahrenheit = tempCelsius * 9/5 + 32;
        System.out.println("Temperature in fahrenheit : " + convFahrenheit);
    }
}
