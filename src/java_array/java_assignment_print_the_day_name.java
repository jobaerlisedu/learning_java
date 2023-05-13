/*
 * Assignment 18 (Print the day name)
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

public class java_assignment_print_the_day_name {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the day number : ");
        int dayNumber = userInput.nextInt();

        String[] days = {"Saturday", "Sunday", "Monday", "Thursday", "Wednesday", "Tuesday", "Friday"};

        System.out.println("Today is " + days[dayNumber - 1]);

    }

}
