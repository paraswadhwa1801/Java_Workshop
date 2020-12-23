public class TestStaticExample {
    
    public static void main(String[] args) {
        new StaticExample();        //frogCount = 1
        new StaticExample();        //frogCount = 2
        new StaticExample();        //frogCount = 3

        System.out.println("from static "+StaticExample.getFrogSize()); //accessing static variable

        new StaticExample();        //frogCount = 4

        new TestStaticExample().go();       //call go()

        StaticExample se = new StaticExample();
        // The JVM does not care which instance is trying to access a static variable
        System.out.println("use ref var "+se.getFrogSize());    //frogCount = 5
    }

    void go() {
        // Accessing a static variable from an instance (non-static) method
        System.out.println("from instance "+ StaticExample.getFrogSize());  //frogCount=4
    }
}
