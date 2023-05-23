package java_array;

import java.util.ArrayList;

public class java_array_arraylist_operations {

    public static void main(String[] args) {

        // creating arraylist
        ArrayList<Integer> numbers = new ArrayList<>();

        // assigning values to arraylist
        for (int num = 10; num <= 100; num = num + 10) {

            numbers.add(num);

        }

        // printing arraylist
        System.out.println(numbers);

        // is arraylist empty?
        System.out.println("Is numbers arraylist empty? " + numbers.isEmpty());

        // identify a value's index number
        System.out.println("Index of 40 : " + numbers.indexOf(40));

        // search a value in arraylist
        System.out.println("Is 50 in the arraylist? " + numbers.contains(50));

        // replace a value in arraylist
        numbers.set(5, 55);
        System.out.println("Arraylist after modification : " + numbers);

        // get a value from arraylist by index number
        System.out.println("In 4th index, Value : " + numbers.get(4));

        // remove 5th value from arraylist
        numbers.remove(5);
        System.out.println("After removing 5th value from the arraylist : " + numbers);

        // Remove all the values from arraylist
        numbers.clear();
        System.out.println("After cleaning the arraylist, numbers arraylist : " + numbers);

    }

}
