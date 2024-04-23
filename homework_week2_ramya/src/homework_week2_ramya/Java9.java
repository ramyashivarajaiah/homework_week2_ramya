package homework_week2_ramya;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Java9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string in uppercase: ");
        String uppercase = scanner.nextLine();
        String lowercase = uppercase.toLowerCase();
        System.out.println("The string in lowercase is: " + lowercase);
        scanner.close();

    }
}
