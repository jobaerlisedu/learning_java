package java_core;

import java.util.Scanner;

public class java_for_loop {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String userName = userInput.next();

        System.out.print("How many times you want to print your name? ");
        int loopTime = userInput.nextInt();

        for (int i = 1; i <= loopTime; i++) {

            System.out.println("0" + i + " . " +userName);

        }
    }

}
