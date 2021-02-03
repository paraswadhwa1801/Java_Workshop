public class OrderOfPrecedenceExample {
    
    public static void main(String[] args) {
        
        System.out.println((-7 -4) + " " + (- (7 - 4)));        //-11  -3

        System.out.println((2 + 3 * 4) + " " + (2 + 3) * 4);    //14  20

        System.out.println(7 > 5 && 2 > 3);           //false

        System.out.println((true & false == false | true) + " ");   //true

        System.out.println(((true & false) == (false | true)));     //false
    }
}
