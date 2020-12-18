//Example to understand the use case of overloading constructors

public class Animal {
    
    String name;    //Instance variable

    Animal(String name) {       //Constructor with 1 argument to set the instance variable
        this.name = name;
    }

    Animal() {
        this(makeRandomName());     //making call to the constructor with String as argument
    }

    static String makeRandomName() {        //static method to return a random name
        int x = (int) (Math.random() * 5);
        return new String[] {
            "Fluffy", "Fido", "Rover", "Spike", "Gigi"
        } [x];
    }

    public static void main(String[] args) {
        Animal a = new Animal();        //As no params passed, it will invoke the no-args constructor
        //Flow in the above constructor invocation
        //1 -> no-args contructor 
        //2 -> makeRandomName() 
        //3 -> constructor with accepts string as an argument
        //4 -> call to the super()
        //5 -> initialize 'name' instance variable
        System.out.println(a.name);


        Animal b = new Animal("Robin");
        //Flow in the above constructor invocation
        //1 -> call to the super()
        //2 -> initialize 'name' instance variable
        System.out.println(b.name);
    }

}