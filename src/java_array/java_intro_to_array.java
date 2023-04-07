package java_array;

public class java_intro_to_array {

    public static void main(String[] args) {

        // Creating array
        int[] arrayDemo = new int[5];

        // Assigning values in array
        arrayDemo[0] = 2;
        arrayDemo[1] = 4;
        arrayDemo[2] = 6;
        arrayDemo[3] = 8;
        arrayDemo[4] = 10;

        // length is used to identify the size of array
        System.out.println("Size of array : " + arrayDemo.length);

        // Let's tyre to calculate the sum of array elements
        int sum = arrayDemo[0] + arrayDemo[1] + arrayDemo[2] + arrayDemo[3] + arrayDemo[4];
        System.out.println("The sum of array elements : " + sum);

    }

}
