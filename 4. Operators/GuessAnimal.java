public class GuessAnimal {

    public static void main(String[] args) {
        
        String animal = "unknown";
        int weight = 700;
        char sex = 'm';
        double colorWavelength = 1.630;

        if(weight >= 500) animal = "elephant";      
        if(colorWavelength > 1.621) animal = "gray " + animal;  

        // when comparing a char with a char, java will use the unicode value
        if(sex <= 'f') animal = "female " + animal;

        //prints the unicode value of the char 'm' i.e, 109 
        System.out.println((int)sex);

        //prints the unicode value of the char 'f' i.e, 102
        System.out.println((int) 'f');
        
        System.out.println("The animal is a " + animal);

    }
}