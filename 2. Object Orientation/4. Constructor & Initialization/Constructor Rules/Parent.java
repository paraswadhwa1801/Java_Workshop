public class Parent {
    private Parent(){
        System.out.println("Parent constructor");
    }
    public static Parent returnObject(){        //Rule 1
        return new Parent();
    }
}
