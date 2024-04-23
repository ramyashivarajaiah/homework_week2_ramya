package variables;

public class StaticVariable {
    /**
     * Stativ variable - classs or class name
     * scope - within the class
     * memory allocation - when class is loaded
     * store - no heap memory
     */
    static int a= 10;
    static String name = "PrimeTesting";

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(StaticVariable.a);
        System.out.println(name);
        System.out.println(StaticVariable.name);

    }
    public void m1(){
        System.out.println(a);
        System.out.println(StaticVariable.a);

    }



}
