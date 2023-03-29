package java_core;

import java.util.Scanner;

public class java_exercise_reverse_number {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter any postive integer: ");
        int temp = userInput.nextInt();
        int sum = 0;
        while(temp!=0){
            int r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        System.out.println(sum);

    }

}
