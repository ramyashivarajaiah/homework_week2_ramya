import java.util.Scanner;

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
