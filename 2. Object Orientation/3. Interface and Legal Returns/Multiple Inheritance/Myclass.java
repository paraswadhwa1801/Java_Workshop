public class Myclass implements Interface1,Interface2{
    
     @Override                           //mandatory as two default methods() with same name exist
     public void method(){
         System.out.println("Inside My class");
     }
    public static void main(String[] args) {
        Myclass my=new Myclass();
        Interface1 i1=new Myclass();
        Interface2 i2=new Myclass();
        my.method();
        i1.method();
        i2.method();
        //to access specific interface method
        my.callInterface1Method();
    }

    private void callInterface1Method() {
        Interface1.super.method();
    }
}
