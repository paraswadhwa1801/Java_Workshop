public class BinaryLiteralsExample {
    
    public static void main(String[] args) {
        
        // Binary literals must start with 0B or 0b
        int b1 = 0B101010;
        int b2 = 0b00011;

        System.out.println(b1);
        System.out.println(b2);

        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // Syntax error on token "2", delete this token
        // int b3 = 0B12;
        // System.out.println(b3);
    }
}
