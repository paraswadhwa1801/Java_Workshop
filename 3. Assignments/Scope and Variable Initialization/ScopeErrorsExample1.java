public class ScopeErrorsExample1 {
    
    int x = 5;

    public static void main(String[] args) {
        
        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // Cannot make a static reference to the non-static field x
        // x++;
    }
}
