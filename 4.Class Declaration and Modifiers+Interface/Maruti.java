import com.trial.package1.Car;
class Maruti /*extends Car*/{           //cann't extend final class

    public static void main(String... s) {
        Car car=new Car();              //Final class object can be created
        System.out.println(car.x);      //can access public variables & methods
       /* System.out.println(car.y);    //cann't access y coz it has default access 
                                        i.e. can be accessed in same package*/
    }
}
