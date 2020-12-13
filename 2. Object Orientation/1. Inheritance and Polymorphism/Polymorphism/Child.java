public class Child extends Parent implements MyInterface{
    public void test(){                     //Overriding Parent's class and MyInterface test()
        System.out.println("Testing Child's method");
    }
    public void childMethod(){
        System.out.println("This is solely child's method");
    }
    public static void main(String[] args) {
        Child c=new Child();                //Object of child class
        Parent p=c;                         //Object of child class stored in Parent's reference variable
        MyInterface my=c;                   //Object of child class stored in MyInterface's reference variable
        c.test();                           //Calling test() defined above
        c.childMethod();  
        c.test1();                     
        p.test();                           //It will also invoke the overridden method
        my.test();         
        Parent parent=new Parent();         //Creating object of Parent Class
        parent.test();                      //It will invoke Parent's test()
       // p.childMethod();                  //Not possible coz childMethod can be invoked  
        // my.childMethod();                //with child's reference variable
        

    }
}
