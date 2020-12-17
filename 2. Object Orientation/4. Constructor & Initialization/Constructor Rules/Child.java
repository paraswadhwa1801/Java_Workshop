public class Child {
    public Child(){
        System.out.println("Constructor called");
    }
    public void Child(){            //Rule 4
        System.out.println("Not a constructor");
    }
    public Child(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        Parent p=Parent.returnObject();
        System.out.println(p);
       // new Child().Child();
    }
}
