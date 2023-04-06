// validate user based on username and password
// input username and password until username=="anis" and password=="123456"
// if username and password does not match print "username/password is incorrect. Please try again"
// if username and password does not match print "welcome to the system"

package java_core;

import java.util.Scanner;

public class java_assignment_validate_user {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        boolean logIn = false;

        while (!logIn) {

            System.out.print("Username : ");
            String userName = userInput.nextLine();
            System.out.print("Password : ");
            String userPass = userInput.nextLine();

            if (userName.equalsIgnoreCase("hsjobaer") && userPass.equalsIgnoreCase("1234")) {

                System.out.println("Welcome to the system...!");
                logIn = true;

            } else {

                System.out.println("username/password is incorrect. Please try again");

            }

        }

    }

}
