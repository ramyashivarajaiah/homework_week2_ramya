import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        double base = scanner.nextDouble();
        System.out.println("Enter the hight of the triangle:");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);
        scanner.close();
    }
}
