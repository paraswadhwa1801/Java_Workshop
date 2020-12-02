import com.trial.package1.Car;
class Maruti implements Checkable/*extends Car*/{           //cann't extend final class

    public void print(){
        System.out.println("Needs to be overridden coz its an abstract method of interface");
    }
    // public void defaultMethod(){
    //     System.out.println("Its optional to override default methods of interface");
    // }
    public static void main(String... s) {
        Car car=new Car();              //Final class object can be created
        System.out.println(car.x);      //can access public variables & methods
       /* System.out.println(car.y);    //cann't access y coz it has default access 
                                        i.e. can be accessed in same package*/
        Maruti maruti=new Maruti();
        maruti.defaultMethod();
        maruti.print();
    }
}
