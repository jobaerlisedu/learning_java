package java_array;

import java.util.ArrayList;

public class java_intro_to_arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(3, 40);

        // Printing arrayList
        System.out.println(numbers);
        System.out.println("Sum of arrayList : " + numbers.size());

        // Removing elements
        numbers.remove(2);
        System.out.println(numbers);
        System.out.println("Size ArrayList after remove an element : " + numbers.size());

        // Removing all elements
        numbers.removeAll(numbers);
        System.out.println(numbers);
        System.out.println("Size ArrayList after remove an element : " + numbers.size());

    }

}
