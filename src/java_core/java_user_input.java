package java_core;

// importing scanner library
import java.util.Scanner;

public class java_user_input {
    public static void main(String[] args) {
        // creating scanner object
        Scanner userInput = new Scanner(System.in);

        // taking data with userInput
        System.out.print("Enter your name : ");
        String userName = userInput.nextLine();

        System.out.print("Enter your age : ");
        int userAge = userInput.nextInt();

        // printing user input data.
        System.out.println("Hello, Mr/Mrs/Mst. " + userName);
        System.out.println("You are already " + userAge);
    }
}
