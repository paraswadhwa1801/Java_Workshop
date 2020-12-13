public class BMW extends Car{

   //  @Override
    public void honk(){
        System.out.println("Blowing horn from BMW");
    }

    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.setEnginePower(1000);
        System.out.println("Engine Power of bmw is:"+bmw.getEnginePower()+"hp");
        bmw.honk();
        bmw.startCar();
    }
    
}
