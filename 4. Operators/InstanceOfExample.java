public class InstanceOfExample {
    
    public static void main(String[] args) {
        
        String s = new String("foo");

        // Since s reference variable is referencing to String type of object
        // it is an instance of string class
        if(s instanceof String)
            System.out.println("s is a string");

    }
}
