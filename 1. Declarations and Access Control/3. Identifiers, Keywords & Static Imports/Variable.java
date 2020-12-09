class Variable{
    int x;                          //global non-static variable
    static int y;                   //global static variable
    static void method1()
    {
        //you cann't declare static variable inside a method as it belongs to whole class
        //static int i;             //local static variable doesnt exist
        int j=10;                   //local variable
        System.out.println("static variable:"+j);
    }

    public static void main(String... args){
        Variable v=new Variable();  //object
        System.out.println("Global static variable:"+Variable.y+"\nGlobal non-static variable:"+v.x);
        method1();
    }
}