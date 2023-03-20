package java_core;

import java.util.Scanner;

public class java_exercise_checking_vowel_consonant {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a character : ");
        String userEnteredChar = userInput.next();
        
        if (userEnteredChar.equalsIgnoreCase("a")) {

            System.out.println(userEnteredChar + " is a vowel.");
            
        } else if (userEnteredChar.equalsIgnoreCase("e")) {

            System.out.print(userEnteredChar + " is a vowel.");

        } else if (userEnteredChar.equalsIgnoreCase("i")) {

            System.out.print(userEnteredChar + " is a vowel.");

        } else if (userEnteredChar.equalsIgnoreCase("o")) {

            System.out.print(userEnteredChar + " is a vowel.");

        } else if (userEnteredChar.equalsIgnoreCase("u")) {

            System.out.print(userEnteredChar + " is a vowel.");

        } else {

            System.out.println(userEnteredChar + " is a consonant.");

        }
    }
}
