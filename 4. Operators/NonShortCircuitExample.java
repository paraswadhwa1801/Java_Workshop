public class NonShortCircuitExample {
    
    public static void main(String[] args) {
        
        int z = 5;
        // Evaluates the first condition, hence short circuit
        if(++z > 5 || ++z > 6)  z++;
        System.out.println(z);      //7

        int y = 5;
        // Evaluates both the conditions (This is inefficient)
        if(++y > 5 | ++y > 6)  y++;
        System.out.println(y);      //8

    }
}
