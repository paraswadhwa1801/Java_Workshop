import static java.lang.System.out;
public abstract class Test {

    abstract void method();     //atleast one abstact method is necessary in abstract class
    static void nonAbstractMethod(){
        out.println("Abstract class can have normal methods which are not mandatory to be overridden");
    }
    void nonStaticMethod(){
        out.println("This method cann't be called from the same class but can be executed by its subclass");
    }
    public static void main(String[] args) {
        //Test test=new Test();
        //test.nonStaticMethod(); //not possible
        out.println("Abstract class cann't be instantiated");
        nonAbstractMethod();
        
    }
    
}
