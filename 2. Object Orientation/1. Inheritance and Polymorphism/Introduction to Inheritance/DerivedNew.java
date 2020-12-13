class Test  { 
    void myMethod() { 
        System.out.println("GeeksforGeeks"); 
    } 
} 

public class DerivedNew extends Test { 
    
    // @Override annotation is added just for understanding purposes
    @Override
    void myMethod() { 
        System.out.println("GFG"); 
    } 
    public static void main(String[] args) 
    { 
        //Storing object of child into parent's reference variable is acceptable
        Test object1 = new DerivedNew(); 

        //Throws compile time error as the parent class object cannot be stored
        //referencing to a child class
        //DerivedNew object2 = new Test();

        // Invokes the myMethod() of DerivedNew as it overrides the superclass myMethod()
        // Hence prints, GFG
        object1.myMethod(); 
    } 
} 