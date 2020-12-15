package OverloadExample.Reference;

public class UseAnimals {
    public void doStuff(Animals a) {
        System.out.println("Animals reference");
    }

    public void doStuff(Horse h) {
        System.out.println("Horse reference");
    }
    public static void main(String[] args) {
        UseAnimals ua= new UseAnimals();
        Animals animals= new Animals();
        Horse horse=new Horse();
        //Generic
        ua.doStuff(animals);        //invokes doStuff() having Animals reference variable as arguement
        ua.doStuff(horse);          //invokes doStuff() having Horse reference variable as arguement

        Animals animalsRefToHorse= new Horse();
        ua.doStuff(animalsRefToHorse);        //invokes doStuff() having Animals reference variable as arguement
                                                //coz overloading depends on reference variable type
    }
}
