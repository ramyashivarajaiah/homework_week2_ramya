package homework_week2_ramya;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

public class Java6 {

    public static void main(String[] args) {
        // Create a Scnner onject to read input from the user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr the radius of the circle");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circule with radius" + radius + " is: " + area);
        scanner.close();


    }


}
