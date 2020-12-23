//An example to understand the concept of static variables
public class Frog {

    static int frogCount = 0;       //static variable
    // int frogCount = 0;           //Non-static variable

    public Frog() {
        frogCount += 1;      //incrementing th value of the static variable to show that
                            //there is only one copy and is independent of the instance of class Frog
    }

    public static void main(String[] args) {
        new Frog();
        new Frog();
        new Frog();

        //Throws compile-time error if the frogCount is an non-static variable
        //as the JVM will not be able to identify which Frog's instance is trying
        //to access the frogCount variable
        System.out.println("Frog count is now "+frogCount);
    }
}