public class StaticExample {

    private static int frogSize = 0;           //static variable

    static int getFrogSize() {      //static method
        return frogSize;
    }

    // Contructor
    public StaticExample() {
        frogSize += 1; 
    }
}
   

