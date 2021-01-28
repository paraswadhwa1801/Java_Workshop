import java.util.Date;

public class ObjectReferenceInitializationExample {
    
    public static void main(String[] args) {
        
        // Date date;

        // Explicitly initialize date to be null
        Date date = null;

        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // The local variable date may not have been initialized
        if(date == null) {
            System.out.println("date is null");
        }
    }
}
