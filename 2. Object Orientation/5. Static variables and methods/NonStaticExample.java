public class NonStaticExample {
    
    int frogSize = 0;           //instance variable

    public int getFrogSize() {      //non-static method
        return frogSize;
    }

    // constructor
    public NonStaticExample(int s) {
        frogSize = s;
    }

    public static void main(String[] args) {
        NonStaticExample nse = new NonStaticExample(25);
        System.out.println(nse.getFrogSize());      //Accessing instance method using (dot operator)
                                                    //nse reference variable of type NonStaticExample
    }

}
