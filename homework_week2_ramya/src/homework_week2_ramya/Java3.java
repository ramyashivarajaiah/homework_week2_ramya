package homework_week2_ramya;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Java3 {

    // Step 3.1: Declare one instance and one static variable
    static int staticVar = 22;
    int instanceVar = 31;

    // Step 3.2: Declare one instance method
    void instanceMethod() {

        System.out.println("Inside instance method:");
        System.out.println("Value of instanceVar: " + instanceVar);
        System.out.println("Value of staticVar: " + staticVar);
    }

    // Step 3.3: Declare one static method
    static void staticMethod() {

        System.out.println("Inside static method:");

        Java3 obj = new Java3();
        System.out.println("Value of instanceVar: " + obj.instanceVar);
        System.out.println("Value of staticVar: " + staticVar);
    }

    // Step 3.5: Declare the Main method
    public static void main(String[] args) {

        Java3 instanceStaticExample = new Java3();
        instanceStaticExample.instanceMethod();
        staticMethod();
    }


}
