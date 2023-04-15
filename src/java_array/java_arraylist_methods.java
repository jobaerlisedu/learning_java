package java_array;

import java.util.ArrayList;
import java.util.Scanner;

public class java_arraylist_methods {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Assigning values
        for (int i = 0; i < 5; i++) {

            System.out.printf("number[%d] : ", i);
            numbers.add(userInput.nextInt());

        }

        // Getting a value from ArrayList by index number
        System.out.println(numbers.get(3));

        // Modifying an ArrayList element
        numbers.set(1, 200);
        System.out.println(numbers);

        // Is ArrayList empty?
        System.out.println("Is ArrayList empty? " + numbers.isEmpty());

        // Identify element position
        System.out.println("Position of 200 in ArrayList : " + numbers.indexOf(200));

        // Let's clear the ArrayList
        numbers.clear();
        System.out.println("After Clearing the ArrayList : " + numbers);

    }

}
