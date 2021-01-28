public class VariableInitializationExample {
    
    // the default value of year is 0 as it is an integer
    int year;
    public static void main(String[] args) {
        
        VariableInitializationExample v = new VariableInitializationExample();
        v.showYear();
    }

    public void showYear() {
        System.out.println("The year is "+ year);   // prints
    }
}
