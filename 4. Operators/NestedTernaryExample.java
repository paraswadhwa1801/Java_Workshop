public class NestedTernaryExample {

    public static void main(String[] args) {
        
        int sizeOfYard = 6;
        int numOfPets = 100;

        // Nested ternary operator example
        String status = (numOfPets < 4) ? "Pet count OK" : 
                        (sizeOfYard > 8) ? "Pet limit on edge"
                        : "too many pets";

        System.out.println("Pet status is " + status);  //Pet status is too many pets
    }
}