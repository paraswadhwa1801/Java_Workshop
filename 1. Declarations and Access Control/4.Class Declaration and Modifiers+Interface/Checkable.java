public interface Checkable {
    int x=18;           //by default it is public static final
    void print();       //by default it is public and abstract
    default void defaultMethod(){
        System.out.println("Java 8 allows method body in interface for methods having the keyword 'default'");
    }
    static void staticMethod(){
        System.out.println("Java 8 also allows method body in interface for methods having the keyword 'static' but they cann't be overridden");
    }
}
