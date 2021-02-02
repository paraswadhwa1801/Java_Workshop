public class EqualsMethodExample {

    public static void main(String[] args) {
        
        EqualsMethodExample e1 = new EqualsMethodExample();
        EqualsMethodExample e2 = new EqualsMethodExample();
        EqualsMethodExample e3 = e1;

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";

        // Both the reference variables e1 and e2 are pointing to different objects
        System.out.println(e1.equals(e2));      //false
        // Both the reference variables e1 and e3 are pointing to the same objects
        System.out.println(e1.equals(e3));      //true

        // The equals() overrided in the String class is case sensitive
        System.out.println(s1.equals(s2));      //true
        System.out.println(s1.equals(s3));      //false

    }
}