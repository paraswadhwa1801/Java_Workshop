public class OctalLiteralsExample {
    
    public static void main(String[] args) {
        
        // Integer in octal form should start with 0
        int six = 06;
        int seven = 07;
        int eight = 010;
        int nine = 011;

        System.out.println("Octal 06 = "+ six);
        System.out.println("Octal 07 = "+ seven);
        System.out.println("Octal 010 = "+ eight);
        System.out.println("Octal 011 = "+ nine);

        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // The literal 018 of type int is out of range
        // int not_a_valid_octal_number = 018;
        // System.out.println(not_a_valid_octal_number);
    }
}
