import java.util.Scanner;

public class Java5 {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods.(Note: Two static and Two instance methods.)
     */
//We are crasting static method
    public static String add(int num1, int num2) {
        return num1 + " + " + num2 + "=" + (num1 + num2);
    }


    public static String subtract(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public static String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public static String divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        } else {
            return "Can not divide by zero!";

        }

    }

    public static void main(String[] args) {
        //Static method calls


        Scanner scanner = new Scanner(System.in);

        // Static method calls
        System.out.println("Static Methods:");
        System.out.print("Enter first number: ");
        int staticNum1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int staticNum2 = scanner.nextInt();
        System.out.println(add(staticNum1, staticNum2));
        System.out.println(subtract(staticNum1, staticNum2));

        // Instance method calls
        Java5 java5 = new Java5();
        System.out.println("\nInstance Methods:");
        System.out.print("Enter first number: ");
        int instanceNum1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int instanceNum2 = scanner.nextInt();
        System.out.println(java5.multiply(instanceNum1, instanceNum2));
        System.out.println(java5.divide(instanceNum1, instanceNum2));

        scanner.close();
    }

}


