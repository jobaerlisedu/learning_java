// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english

package java_core;

import java.util.Scanner;

public class java_exercise_call_center_language {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Language List"+
                "\n1. Bengali" +
                "\n2. Hindi" +
                "\n3. Urdu" +
                "\n4. English" +
                "\nSelect language : ");

        int selectedLanguage = userInput.nextInt();

        switch (selectedLanguage) {

            case 1:
                System.out.println("Selected language : Bengali");
                break;

            case 2:
                System.out.println("Selected language : Hindi");
                break;

            case 3:
                System.out.println("Selected language : Urdu");
                break;

            case 4:
                System.out.println("Selected language : English");
                break;

            default:
                System.out.println("Invalid selection");

        }

    }

}
