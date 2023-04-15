package java_array;

import java.util.ArrayList;

public class java_array_intro_to_arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        // Adding values to number arraylist
        number.add(10);
        number.add(20);
        number.add(40);
        number.add(50);
        number.add(2, 30);

        // Printing number arraylist values
        System.out.print("ArrayList<number> :");
        for (int i : number) {

            System.out.print(" " + i);

        }

        // Removing an element from arraylist
        number.remove(1);
        System.out.println("\nAfter remove an element : " + number);

        // Removing all elements from arraylist
        number.removeAll(number);
        System.out.println("After remove all elements : " + number);

    }

}
