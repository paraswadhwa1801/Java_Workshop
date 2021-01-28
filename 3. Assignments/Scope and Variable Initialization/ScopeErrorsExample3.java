public class ScopeErrorsExample3 {
    
    public static void main(String[] args) {

        ScopeErrorsExample3 scopeError = new ScopeErrorsExample3();
        scopeError.go3();
    }

    void go3() {
        for(int z=0; z<5; z++) {
            boolean test = false;
            if(z == 3) {
                test = true;
                break;
            }
        }
    }
    // test is a local variable which is not accessible outside the method
    // System.out.println(test);
}
