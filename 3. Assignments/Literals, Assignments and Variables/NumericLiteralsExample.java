public class NumericLiteralsExample {

    public static void main(String[] args) {
        int million = 1000000;
        //underscores can be used to improve the code readability as of Java 7+
        int million_with_better_readability = 1_000_000;

        System.out.println(million);
        System.out.println(million_with_better_readability);  

        // The below example throws error while compiling
        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // Underscores have to be located within digits
        
        // int million_with_syntax_error = _1_000_000;
        // int million_with_syntax_error_2 = 1_000_000_;
      
    }

}