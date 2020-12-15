package Casting.Downcasting;

public class DownCast {
    public static void main(String[] args) {
        Animal[] a = { new Animal(), new Dog(), new Animal() };//Array of objects
        for(Animal animal:a){
            animal.makeFun();       //at run-time object type will decide to invoke which method
            if (animal instanceof Dog) {
                
                //animal.play(); //Try to Do dog behavior   //compilation error
                
                Dog d=(Dog) animal;     //downcasting animal reference variable having dog's object
                d.play();               //compiles and runs
            }
        }    
    }
    
}
