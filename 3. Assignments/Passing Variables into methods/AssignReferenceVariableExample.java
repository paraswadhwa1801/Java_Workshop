import java.awt.Dimension;

public class AssignReferenceVariableExample {
    
    public static void main(String[] args) {
        Dimension a1 = new Dimension(5, 10);
        System.out.println("a1 height = " + a1.height);

        // The object pointed by the reference variable a1 and b1 is the same
        Dimension b1 = a1;
        b1.height = 30;
        System.out.println("a1 height = " + a1.height + " after change to b1");
    }
}
