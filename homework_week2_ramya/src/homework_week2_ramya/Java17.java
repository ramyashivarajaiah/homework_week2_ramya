package homework_week2_ramya;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Java17 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int decimal = scanner.nextInt();

        scanner.close();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary number is: " + binary);
    }


}
