public class CharacterLiteralsExample {
    
    public static void main(String[] args) {
        char a = 0x892;
        char b = 982;

        // Here casting is necessary as it considers to be the unicode value of a particular symbol
        char c = (char) 70000;
        char d = (char) -98;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // Type mismatch: cannot convert from int to char
        // If casting is not provided, then it is considered as a value of 70,000 which
        // is out of the range of char i.e,. 0-65535
        // char c_error = 70000;
        // System.out.println(c_error);
    }
}
