package homework_week2_ramya;

public class Java1 {

    /**
     * Declare two instance variables.
     * Declare one instance method.
     * Call both instance variables into the instance method inside the print statement.
     * Declare the Main method.
     * Call the above instance method into the Main method and Run the programme.
     */

    int a = 15; // a is a instant variable
    String name = "Testing 1"; // name is a instant variable or global variable

    public static void main(String[] args) {

        Java1 obj = new Java1();
        System.out.println(obj.a);
        System.out.println(obj.name);
        obj.myMethod();
    }

    public void myMethod() {
        System.out.println(a);
        System.out.println(name);

    }

}
