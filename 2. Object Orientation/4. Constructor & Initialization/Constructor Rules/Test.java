public class Test extends Child{
    int x;
    static int y;
    public Test(){
       // super(x);         //Rule 12
        super(Test.y);      //Rule 12
    }
    public Test(int x){
        //super(x);         //Rule 11 & not breaking Rule 12
        //super(this.x);
        this.x=x;
        System.out.println("x: "+x);
      //  super(x);        //Rule 11
       
    }
    public static void main(String[] args) {
        new Test();
        //new Test(10);
    }
}
