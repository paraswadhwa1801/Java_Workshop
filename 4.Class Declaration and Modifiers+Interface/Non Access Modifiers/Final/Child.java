public class Child extends Parent{
    public void method(){       //Not possible
        System.out.println("Trying to override final method");
    }
    public void method2(int x,final int y){
        x=x+10;
        System.out.println(x);
        y=y+10;                  //cann't be done as y is final
        System.out.println(y+10);//possible coz we are not changing y's value
    }
    public static void main(String[] args) {
        Child child=new Child();
        child.method2(10, 10);
        child.method();
        child=new Child();      //possible
        final Child child2=new Child();
        child2=new Child();      //not possible-same thing with local reference variable also
    }
}
