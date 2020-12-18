public class InitTest {
    
    InitTest(int x) {
        System.out.println("1-arg constructor: "+x);                        //8
    }

    InitTest() {
        System.out.println("no-args constructor");                          //5
    }

    static { System.out.println("First static block in the program"); }     //1

    { System.out.println("First instance init block"); }                    //3, 6

    { System.out.println("Second instance init block"); }                   //4, 7

    static { System.out.println("Second static block in the program"); }     //2

    public static void main(String[] args) {
        new InitTest();         //1, 2, 3, 4, 5

        new InitTest(10);       //6, 7, 8
    }

}
