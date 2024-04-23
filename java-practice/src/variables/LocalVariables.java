package variables;

/**
 * local variable - declared inside the method or inside the constructors
 * scope          - within the method or constructor
 * memory allocation - when method starts
 * memory            - stack
 */
public class LocalVariables {

    public static void main(String[] args) {
        // a is a local variable
        int a = 2;
        System.out.println(a);
        a = 3;
        System.out.println(a);
    }


}
