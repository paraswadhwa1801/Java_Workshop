public class CastingExample {
    
    public static void main(String[] args) {
        
        // Implicit casting - compiler automatically performs casting, no extra code required
        // Widening concept
        int a = 100;
        long b = a;
        System.out.println(b);

        // Explicit casting - we need to write the code to perform casting
        // Narrowing concept
        float c = 100.001f;
        int d = (int) c;
        System.out.println(d);

    }
}
