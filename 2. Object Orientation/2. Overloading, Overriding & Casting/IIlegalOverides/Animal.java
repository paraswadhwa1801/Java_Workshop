package IIlegalOverides;

import java.io.IOException;

public class Animal {
    private void eat(){ //Restrictive Access
        System.out.println("Animal private Instance method");
    }

    public void sound() throws IOException{
        System.out.println("Animal Sound Instance Method throws Exception");
    }


    public void walk(){
        
    }
}
