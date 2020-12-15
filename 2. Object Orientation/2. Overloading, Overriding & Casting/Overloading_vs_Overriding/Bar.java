package Overloading_vs_Overriding;
class Bar extends Foo {
    //Overriding
    public void name(int i) {
        System.out.println("Baar Class : Name Method"+" "+i);
    }
    //Overloading
    public void name(String s) {
        System.out.println("Baar Class : Name Method" +" "+ s);
    }

    public static void main(String[] args) {
        
        //Generic
        Foo f=new Foo();        
        f.name(10);             //invokes name() of Foo class having int as param
        Bar b= new Bar();
        b.name(20);             //invokes name() of Bar class having int as param

        // Polymorphism Works
        Foo fh= new Bar();      //actual object type is used to determine which name is called
        fh.name(10);            //invokes name() of Bar class having int as param
        
        //Overloading
        b.name("Nihal");         //invokes name() of Bar class having string as param

        /**
         * Illegal Cases 
        */
        //f.name("i");      //JVM will decide at compile-time to call which method in case of overloading
                            //as name(String s) is not present in Foo class so it will give compilation error
        //fh.name("i");     //doesnot have method with string args

    }
}
