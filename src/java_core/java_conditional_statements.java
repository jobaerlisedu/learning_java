package java_core;

public class java_conditional_statements {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 9;

        if (a > b && a > c) {

            System.out.println(a + " is the greatest number.");

        } else if (b > a && b > c) {

            System.out.println(b + " is the greatest number.");

        } else {

            System.out.println(c + " is the greatest number.");

        }
    }
}
