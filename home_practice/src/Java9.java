import java.util.Scanner;

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
