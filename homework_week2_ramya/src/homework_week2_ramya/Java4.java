package homework_week2_ramya;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Java4 {
    // Step 4.1: Declare two instance and two static variables
    static int a = 25;
    static int b = 45;
    int c = 35;
    int d = 55;

    // Step 4.2: Declare one instance method
    void instanceMethod() {

        System.out.println("Inside instance method:");
        System.out.println("Value of instanceVar1: " + c);
        System.out.println("Value of instanceVar2: " + d);
        System.out.println("Value of staticVar1: " + a);
        System.out.println("Value of staticVar2: " + b);
    }

    // Step 4.3: Declare one static method
    static void staticMethod() {

        System.out.println("Inside static method:");
        Java4 obj = new Java4();
        System.out.println("Value of instanceVar1: " + obj.c);
        System.out.println("Value of instanceVar2: " + obj.d);
        System.out.println("Value of staticVar1: " + a);
        System.out.println("Value of staticVar2: " + b);
    }

    // Step 4.5: Declare the Main method
    public static void main(String[] args) {

        Java4 instanceStaticExample = new Java4();
        instanceStaticExample.instanceMethod();
        staticMethod();
    }
}
