public class ScopeErrorsExample2 {
    
    public static void main(String[] args) {
        
        ScopeErrorsExample2 scopeError = new ScopeErrorsExample2();
        scopeError.go();

    }

    void go() {
        int y = 5;
        go2();
        // The go2() method is pushed out of the stack at this point in the execution
        y++;
        System.out.println(y);
    }

    void go2() {

        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // y cannot be resolved to a variable
        // y++;
    }
}
