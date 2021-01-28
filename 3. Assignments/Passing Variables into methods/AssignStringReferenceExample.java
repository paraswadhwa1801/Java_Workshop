public class AssignStringReferenceExample {

    public static void main(String[] args) {
        
        String x = "Java";
        String y = x;

        // At this point in the execution, both x and y reference to the same object
        System.out.println("String y = " + y);

        // Now, the x reference variable is referencing to a new object in the heap
        x = x + "Workshop";

        // As strings are immutable, the value remains the same
        System.out.println("String y = " + y);
    }
}