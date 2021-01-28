public class ObjectInitializationExample {
    
    private String title;

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        
        ObjectInitializationExample o = new ObjectInitializationExample();
        String s = o.getTitle();
        System.out.println(s);      //null

        // Exception in thread "main" java.lang.NullPointerException
        // String t = s.toLowerCase();     //Run-time exception


        String t = null;
        if(s != null) {
            t = s.toUpperCase();
        }
        System.out.println(t);

    }
}
