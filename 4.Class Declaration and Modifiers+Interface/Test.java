import static java.lang.System.out;
public abstract class Test {

    abstract void method();     //atleast one abstact method is necessary in abstract class
    public static void main(String[] args) {
        //Test test=new Test();
        out.println("Abstract class cann't be instantiated");
    }
    
}
