public class ComparePrimitives {
    
    public static void main(String[] args) {
        
        System.out.println("char 'a' == 'a' " + ('a' == 'a'));      //true
        System.out.println("char 'a' == 'b' " + ('a' == 'b'));      //false
        System.out.println("5 != 6 " + (5 != 6));                   //true

        // The compiler performs implcit casting from long to double (widening)
        System.out.println("5.0 == 5L " + (5.9 == 5L) );            //true
        System.out.println("true == false " + (true == false));     //false

    }
}
