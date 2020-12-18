// Throws compile-time error
public class StackOverFlow {
    
    StackOverFlow() {
        this("Hello");      //calls the constructor which accepts string as an argument
    }

    StackOverFlow(String message) {
        this();             //results in recursive constructor invocation
    }
}
