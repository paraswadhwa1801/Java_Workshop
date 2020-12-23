class Animal {
    
    static void doStuff() {
        System.out.println("animal doStuff()");
    }
}

public class Dog extends Animal {
    
    // redefinition and NOT overriding
    static void doStuff() {
        System.out.println("Dog doStuff()");
    }

    public static void main(String[] args) {
        // An array of objects of reference type Animal
        Animal[] a = {new Animal(), new Dog(), new Animal()};
        for(Animal animal: a) {
            animal.doStuff();   //Invokes the doStuff() from animal for all the three instances
                                //as the reference type is favoured
        }                       //Not method overriding

        // Valid as doStuff() is a static method
        Dog.doStuff();
    }
} 
