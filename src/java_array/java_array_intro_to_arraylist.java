package java_array;

import java.util.ArrayList;

public class java_array_intro_to_arraylist {

    public static void main(String[] args) {

        // Creating new ArrayList
        ArrayList<Integer> numbers =  new ArrayList<>();

        // Assigning values in ArrayList (Method - 01)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Assigning values in ArrayList (Method - 02)
        numbers.add(5, 60);
        numbers.add(6, 70);
        numbers.add(7, 80);

        // Printing ArrayList
        System.out.println(numbers);

        // Printing ArrayList using for each loop
        for (int num : numbers) {

            System.out.print(num + " ");

        }

    }

}
