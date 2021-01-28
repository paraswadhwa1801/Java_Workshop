public class Child extends Parent {
    
    public void childMethod() {
        System.out.println("Hi from child class");
    }
    public static void main(String[] args) {
        
        // Parent reference variable referencing to a child object
        Parent parent = new Child();
        parent.parentMethod();

        // Throws an error as childMethod() is child class method which is not accessible by the parent
        // parent.childMethod();


        // Child reference variable referencing to a child object
        Child child = new Child();
        
        // Child has access to all the parent methods as child class is extending parent class
        child.parentMethod();
        child.childMethod();
    }
}
