public class PrimitiveTypeInitializationExample {

    public static void main(String[] args) {
        
        int year;

        // The compiler does not complain even if the variable is not initialized as it is not used
        int day;

        // Declaration and Initialization can be done on a different line
        // but, it is mandatory to initialize the variable before it is actually used
        // or the compiler complains
        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // The local variable year may not have been initialized
        
        year = 2025;
        // Initialization of a variable in a logically conditional loop leads to
        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // The local variable day may not have been initialized
        // if(year == 2025)
        //     day = 1;

        System.out.println("Welcome to the year: " + year);
        // System.out.println("Day is: " + day);
    }
}