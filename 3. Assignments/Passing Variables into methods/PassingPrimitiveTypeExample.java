public class PassingPrimitiveTypeExample {
    
    public static void main(String[] args) {
        
        // TODO: Check why the Integer wrapper class get the same value after modifying
        // whereas it should not be affected when passed as an argument to the method modify()
        // It follows pass by value and not pass by reference as other reference objects
        // Integer a = new Integer("1");

        int a = 1;
        PassingPrimitiveTypeExample p = new PassingPrimitiveTypeExample();
        
        System.out.println("Before modify() a = " + a);
        p.modify(a);
        System.out.println("After modify() a = " + a);

        // The value of 'a' remains the same, because 'num' is a copy of 'a'
    }

    public void modify(int num) {
        num += 1;
        System.out.println("num = " + num);
    }
}
