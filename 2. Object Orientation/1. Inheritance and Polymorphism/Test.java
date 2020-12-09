class Test {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        if(!t1.equals(t2)) {
            //From the below print statements, we can know that objects are not equal
            //as they are not stored in the same memory address
            System.out.println("They are not equal (every object of a class is unique)");

            //The objects have different hash codes as the JVM assigns unique to every instance
            System.out.println("Getting the hash code of t1: "+t1.hashCode());
            System.out.println("Getting the hash code of t2: "+t2.hashCode());
        }
        
        // Here we can know that any class object is an instance of Object class
        if(t1 instanceof Object)
            System.out.println("t1's an object!");

    }
}