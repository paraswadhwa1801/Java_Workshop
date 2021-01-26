public class AssignmentsExample {
    
    public static void main(String[] args) {
        
        byte a = 3;
        byte b = 8;

        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // Type mismatch: cannot convert from int to byte
        // byte c = a+b;
        // System.out.println(c);

        // Casting is required as an arithmetic operation perfomed on the byte transforms to be
        // int by default
        // So, we use narrowing concept (explicit casting) to byte
        byte c = (byte) (a+b);
        // Or the reference type must be int as below
        int z = a+b;

        System.out.println(c);
        System.out.println(z);
    }
}
