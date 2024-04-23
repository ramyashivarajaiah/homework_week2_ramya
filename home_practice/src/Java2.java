public class Java2 {
    /**
     * 2.1 Declare two static variables
     * 2.2 Declare one static method
     * 2.3 Call both static variables into the static method inside the print statement.
     * 2.4 Declare the Main method.
     * 2.5 Call the static method into the Main method and Run the programme.
     *
     */

    // Step 2.1: Declare two static variables
        static int num1 = 10;
        static String str = "Hello";

        // Step 2.2: Declare one static method
        static void displayVariables() {
            // Step 2.3: Call both static variables into the static method inside the print statement
            System.out.println("Value of num1: " + num1);
            System.out.println("Value of str: " + str);
        }

        // Step 2.4: Declare the Main method
        public static void main(String[] args) {
            // Step 2.5: Call the static method into the Main method and Run the program
            displayVariables();
        }
    }

