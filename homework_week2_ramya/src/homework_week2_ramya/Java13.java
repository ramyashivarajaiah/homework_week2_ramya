package homework_week2_ramya;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Java13 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();

        scanner.close();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("The average of the three numbers is: " + average);
    }
}
