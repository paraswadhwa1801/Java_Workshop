public class ShortCircuitExample {
    
    public static void main(String[] args) {
        
        //  As soon as the first condition is true, it does not check for the second condition
        if((isItSmall(3)) || (isItSmall(7))) {
            System.out.println("Result is true");
        }

        // It will check for the second condition, as the first condition is false
        if((isItSmall(6)) || (isItSmall(9))) {
            System.out.println("Result is true");
        }
    }

    public static boolean isItSmall(int i) {

        if(i < 5) {
            System.out.println("i < 5");
            return true;
        }
        else {
            System.out.println("i >= 5");
            return false;
        }
    }
}
