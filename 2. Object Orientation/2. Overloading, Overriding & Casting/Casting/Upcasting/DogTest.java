package Casting.Upcasting;

public class DogTest {
    public static void main(String[] args) {
        Dog d= new Dog();
        Animals a1=d;           //Implicit upcast
        Animals a2=(Animals) d; //explicitly upcast (not required)
    }
}
