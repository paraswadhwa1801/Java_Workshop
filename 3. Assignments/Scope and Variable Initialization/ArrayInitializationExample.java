public class ArrayInitializationExample {
    
    static int[] arr = new int[5];
    public static void main(String[] args) {

        // All the elements have been initialized to 0 as the literal type is int
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
            
        // Prints the name of the proxy class as the array does not have
        // an underlying data structure
        System.out.println(arr.getClass().getName());
    }
}
