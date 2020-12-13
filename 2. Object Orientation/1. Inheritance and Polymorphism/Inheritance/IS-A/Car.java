public class Car extends Vehicle{
    public void startCar(){
        System.out.println("Starting the car!");
    }
     public static void main(String[] args) {
         Car car=new Car();
         car.honk();
     }
}
