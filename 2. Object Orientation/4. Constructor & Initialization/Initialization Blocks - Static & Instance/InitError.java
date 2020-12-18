public class InitError {
    
    // int[] x = new int[4];        if declared without the static keyword, it results in compile-time error

    static int[] x = new int[4];
    static { x[4] = 100; }          //Throws run-time error as it results in index out of bound exception

    public static void main(String[] args) {
        
    }
}
