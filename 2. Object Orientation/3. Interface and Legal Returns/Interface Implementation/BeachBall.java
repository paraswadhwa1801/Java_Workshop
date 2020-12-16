import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class BeachBall extends Ball {
   // no need to override bounce() again here as it is overriden in Ball class
   @Override
   public void setBounceFactor(int i) { // have to override all abstarct method of Bounceable
      System.out.println("Bounce factor: " + i); // as this is the first concrete class(non-abstract)
   }

   @Override
   public void beSpherical() { // overriding abstarct method of Ball class
      System.out.println("I am spherical beach ball");
   }
   @Override
   public void method() throws IOException,FileNotFoundException//,ParseException 
   {
     System.out.println("Checking Exception");
   }

   public static void main(String[] args) {
      new BeachBall().Bounce();
      new BeachBall().setBounceFactor(10);
      new BeachBall().beSpherical();
   }

   
}
