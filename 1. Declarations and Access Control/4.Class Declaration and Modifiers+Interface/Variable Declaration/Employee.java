class Employee{
    // instance variable 
    private String name="Foo";
    private String designation="MTS";
    int count;
    // initialize value of final field other wise give error
    //final private String number=20;
    public void local() {
        int count=10;
        this.count=count;
        System.out.println( "\n local variable"+count);
    }
    public void instanceVar(int i) {
        //count=i;
        String name="Mark";
         //shadowing
        //this.name=name;
        System.out.println("instance variable"+"\n"+this.name+"\n"+designation+"\n"+count);
    }
    public static void main(String[] args) {
        new Employee().local();
        new Employee().instanceVar(3);
    }
}