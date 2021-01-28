class ByteSizeExample {

    public static void main(String[] args) {
        
        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // Type mismatch: cannot convert from int to byte
        // byte a = 128;

        // As we know that the default type is int, we need to cast it to byte
        // When it is done, the complier considers only the lower 8 bits (8th bit being a sign flag)
        // Hence, the 2's complement of 128 is -128 which is in the byte range (-128 to 127)
        byte a = (byte) 128;
        System.out.println(a);
    }
}