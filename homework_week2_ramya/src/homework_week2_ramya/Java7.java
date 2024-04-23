package homework_week2_ramya;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Java7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temprature in Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();
        double celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.println("The temprature in Celsius is: " + celsius + "c");
        scanner.close();
    }


}
