public class TernaryOperatorExample {

    public static void main(String[] args) {
        
        int numOfPets = 3;
        //              |  condition  |          if true          | if false
        String status = (numOfPets<4) ? "Pet limit not exceeded" : "too many pets";

        System.out.println("This pet status is " + status);

    }
}