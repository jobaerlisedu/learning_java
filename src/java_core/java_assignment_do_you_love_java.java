// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover

package java_core;

import java.util.Scanner;

public class java_assignment_do_you_love_java {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Do you love java? (Y/N) : ");
        String doYouLoveJava = userInput.next();

        if (doYouLoveJava.equalsIgnoreCase("y")) {

            System.out.println("Hehe, you are a java lover");

        } else {

            System.out.println("Get out from here");

        }
    }
}
