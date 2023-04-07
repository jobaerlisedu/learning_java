package java_array;

public class java_array_for_each_loop {

    public static void main(String[] args) {

        String[] names = {"Anwar", "Monowar", "Jobaer", "Ojaer"};
        int[] numbers = {2, 4, 6, 8, 10};

        for (String name : names) {

            System.out.println(name);

        }

        for (int number : numbers) {

            System.out.println(number);

        }

    }

}
