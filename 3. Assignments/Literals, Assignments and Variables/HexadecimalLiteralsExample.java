class HexadecimalLiteralsExample {

    public static void main(String[] args) {
        
        // The number should have a prefix of 0X or 0x
        int x = 0X0001;
        int y = 0x7fffffff;

        System.out.println(x);
        System.out.println(y);

        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // Syntax error on token "g", delete this token
        // int z = 0x000g;
        // System.out.println(z);
    }
}