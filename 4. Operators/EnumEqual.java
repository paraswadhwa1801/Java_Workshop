public class EnumEqual {
    
    enum Color {RED, BLUE}
    public static void main(String[] args) {
        
        Color c1 = Color.RED;
        Color c2 = Color.RED;

        // Both the enum reference variables point to the same constant
        if(c1 == c2) System.out.println("==");      //true
        if(c1.equals(c2)) System.out.println("dot equals");     //true


    }
}
