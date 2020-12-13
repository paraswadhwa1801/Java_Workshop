public class Biker{
    private Bike bike=new Bike();
    private void bikeStart(){
        bike.start();
    }
    public static void main(String[] args) {
        new Biker().bikeStart();
    }
}