public class CompoundAssignmentExample {
    
    public static void main(String[] args) {
        
        byte b = 3;
        // the compound assignment operator += performs implicit casting from int to byte
        b += 3;
        System.out.println(b);

        byte c = 3;
        
        // c = c + 7;
        // 7 is an int and results in an error if explicit casting is not provided
        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // Type mismatch: cannot convert from int to byte

        c = (byte) (c + 7);
        System.out.println(c);

    }
}
