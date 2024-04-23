package homework_week2_ramya;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Java16 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        scanner.close();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int sum = num1 + num2;

        String binarySum = Integer.toBinaryString(sum);

        System.out.println("\nSum of two binary numbers: " + binarySum);
    }
}
