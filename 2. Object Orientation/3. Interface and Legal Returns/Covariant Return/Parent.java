public class Parent{
    public Parent doStuff(){
        System.out.println("Parent's method");
        return new Parent();
    }
}