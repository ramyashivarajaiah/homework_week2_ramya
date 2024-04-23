package variables;

public class    InstanceVariables {
    /**
     * Instance - object
     * Scope    - within the class
     * Memory   - When the object is created
     * memory   - heap
     */

    int a = 10; // a is a Instance variable or Global variable
    String name = "Prime Testing"; //name is a Instance variable or Gloabal variable

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(obj.name);

    }

    public void myMethod(){
        System.out.println(a);
        InstanceVariables inststanceVariables = new InstanceVariables();
        System.out.println(inststanceVariables.name);

    }


}
