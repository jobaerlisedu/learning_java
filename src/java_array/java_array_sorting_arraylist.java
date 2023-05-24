package java_array;

import java.util.ArrayList;
import java.util.Collections;

public class java_array_sorting_arraylist {

    public static void main(String[] args) {

        // creating a number arraylist
        ArrayList<Integer> numbers = new ArrayList<>();

        // assigning values in number arraylist
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        // printing number arraylist
        System.out.println("Number arraylist before sorting : " + numbers);
        
        // sorting number arraylist in ascending order
        Collections.sort(numbers);
        System.out.println("Number arraylist after sorting in ascending order : " + numbers);

        // sorting number arraylist in descending order
        numbers.sort(Collections.reverseOrder());
        System.out.println("Number arraylist after sorting in descending order : " + numbers);

    }

}
