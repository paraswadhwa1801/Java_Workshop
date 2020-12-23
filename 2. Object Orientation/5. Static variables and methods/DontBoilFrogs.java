public class DontBoilFrogs implements FrogBoilable{
    
    public static void main(String[] args) {
        new DontBoilFrogs().go();
    }

    void go() {
        System.out.println(hop());         //Invoking the default method of FrogBoilable interface

        // System.out.println(getCToF(100));  //undefined error as that method is not defined in this class

        System.out.println(FrogBoilable.getCToF(100));  //Invoking a static method declared in interface

        FrogBoilable dbf = new DontBoilFrogs();    

        System.out.println(dbf.getCToF(100));    //undefined error as the object cannot access
                                                 // the static method declared in the interface directly

    }
}
