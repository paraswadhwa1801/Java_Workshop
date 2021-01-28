import java.awt.Dimension;

public class PassingObjectReferenceExample {
    
    public static void main(String[] args) {
        
        Dimension d = new Dimension(5, 10);
        PassingObjectReferenceExample p = new PassingObjectReferenceExample();

        System.out.println("Before d.height = " + d.height);
        p.modify(d);
        System.out.println("After d.height = " + d.height);

        // This is an example of pass by-value 
        // as both the reference variables d and dim refer to the same object on the heap
        // Hence, the value of d.height changes

    }

    public void modify(Dimension dim) {
        dim.height += 1;
        System.out.println("dim = " + dim.height);
    }
}
