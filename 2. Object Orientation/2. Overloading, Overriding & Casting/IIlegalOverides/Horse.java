package IIlegalOverides;

import java.io.IOException;
//import java.text.ParseException;

public class Horse extends Animal {
    /***
     * 1. Private Method in Animal Class
     */
    // @Override will give compilation error
    public void eat() {
        System.out.println("Horse Instance public method");
    }

    /**
     * 2. Checked Exception in Animal Method
     */
    // throws ParseException cannot mention any new or broaded exception while
    // overriding
    public void sound() throws IOException {
        System.out.println("Horse Sound Instance Method without Exception");
    }

    /**
     * 3. Over load
     * 
     * @param food
     */
    public void sound(String food) {
        // overload not overriding due to change in arguments
    }

    /***
     * 4. Change of return type
     */
    // public String walk() {} //compilaion error

    public static void main(String[] args) {
        Animal a = new Horse();
        Horse s = new Horse();
        try {
            s.sound(); // compile Success
        } catch (IOException e) {
            System.err.println("error");
        }
        /***
         * Compiler assume it invoke Animal method with Exception
         */

        // a.sound(); //compilation error -- unreported Exception //should be handled by
        // try-catch{}
    }
}
