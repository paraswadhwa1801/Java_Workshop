class TestPolymorphism {
    public static void main(String[] args) {
        
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        // passing the child class object to doShapes() as argument 
        // which is accepting parent class object as a parameter
        // The child class has access to all the members of the parent class
        // The doShapes() will check for the type and due to inheritance, it works
        doShapes(c1);
        doShapes(c2);

        // Outputs true
        System.out.println(c1 instanceof Parent && c2 instanceof Parent);

    }

    public static void doShapes(Parent p) {
        p.displayShape();
    }
}