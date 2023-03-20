// Logical and assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n
// Step 2: Ask the candidate are you fluent in English? y/n
// Step 3: if the candidate has passed masters and also have fluent english skill then print "you are eligible to for the job interview"
// Step 4: else print "Sorry, you are not eligible to for the job interview"

package java_core;

import java.util.Scanner;

public class java_assignment_checking_eligible_candidate {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String masterDegree, englishSkill;

        System.out.print("Have you completed your masters? Y/N : ");
        masterDegree = userInput.next();

        System.out.print("Are you fluent in English? Y/N : ");
        englishSkill = userInput.next();

        if ((masterDegree.equalsIgnoreCase("y")) && (englishSkill.equalsIgnoreCase("n"))) {

            System.out.println("You are eligible to for the job interview");

        } else {

            System.out.println("Sorry, you are not eligible to for the job interview");

        }
    }
}
