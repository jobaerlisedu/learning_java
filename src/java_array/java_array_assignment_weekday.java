/*
 * Assigment 18 (Print the day name)
 * declare an array of weekdays
 * User will give a day number you have to print the equivalent day name
 *
 * Example 1
 * input-> Enter day number (1-7) : 1
 * output-> Monday
 *
 * Example 2
 * input-> Enter day number (1-7) : 3
 * output-> Wednesday
 */

package java_array;

import java.util.Scanner;

public class java_array_assignment_weekday {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String[] weekdays = new String[7];

        weekdays[0] = "Saturday";
        weekdays[1] = "Sunday";
        weekdays[2] = "Monday";
        weekdays[3] = "Tuesday";
        weekdays[4] = "Wednesday";
        weekdays[5] = "Thursday";
        weekdays[6] = "Friday";

        System.out.print("Enter the number of day : ");
        int dayNumber = userInput.nextInt();

        for (int i = 0; i < weekdays.length; i++) {

            if (i+1 == dayNumber) {

                System.out.println("Today is " + weekdays[i]);

            }

        }
    }

}
