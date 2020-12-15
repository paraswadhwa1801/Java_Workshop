package OverloadExample.Primitive;

public class TestAdder {
    public static void main(String[] args) {
        Adder add= new Adder();
        System.out.println(add.addThem(27, 3));         //calling addThem() which accepts int as params 
        System.out.println(add.addThem(22.5,9.33));     //calling addThem() which accepts double as params
        //even println() is overloaded by java itself for any primitive as well as non-primitive data type
    }
}
