package SuperKeyword;

public class Horse extends Animal {
    
    public void printYourself() {
        super.printYourself();      //calling parent's printYourself() using super keyword
        System.out.println("Horse method");    
    }

    public static void main(String[] args) {
        new Horse().printYourself();
    }
    
}