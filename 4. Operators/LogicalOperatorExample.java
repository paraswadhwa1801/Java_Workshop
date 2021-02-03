public class LogicalOperatorExample {
    
    public static void main(String[] args) {
        
        boolean b1 = false;
        boolean b2 = false;

        // As soon as the first condition fails, it does not check the second
        // this is short-circuit logical AND (&&) operator example
        boolean b3 = (b1 == true) && (b2 = true);
        System.out.println(b3 + " " + b2);      //false false
    }
}
