public class Vehicle{
    private int enginePower;            
    public void setEnginePower(int enginePower){        //setter
        this.enginePower=enginePower;
    }
    public int getEnginePower(){                        //getter
        return enginePower;
    }
    public void honk(){                                 
        System.out.println("Blow Horn!");
    }
}