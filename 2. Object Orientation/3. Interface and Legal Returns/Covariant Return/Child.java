public class Child extends Parent {
    @Override
    public Child doStuff(){
        System.out.println("In child method");
        return new Child();
    }
    public Parent method(){
       System.out.println("Checking covariant return");
        return new Child();     //wrapping child object into parent reference-Upcasting
    }
    public Child method1(){
        System.out.println("Checking covariant return");
         return (Child)new Parent();     //wrapping child object into parent reference-Upcasting
     }
    public static void main(String[] args) {
        new Child().doStuff();
        new Child().method();
        new Child().method1();
    }
}
