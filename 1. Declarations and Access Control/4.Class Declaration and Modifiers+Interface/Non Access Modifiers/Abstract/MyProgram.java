public class MyProgram extends MouseClick {
    void get(int x,int y){
        this.x=x;       //setting the value of variables declared in 
        this.y=y;       //abstract class
    }
    @Override
    public void mouseClickListener(){
        System.out.println("Mouse clicked");
        System.out.println(this);
    }
    public static void main(String[] args) {
        MyProgram program=new MyProgram();
        System.out.println(program);
        program.get(10, 20);
        program.show();
        program.click(program);         //registering child object with parent class-Upcasting
    }
}
