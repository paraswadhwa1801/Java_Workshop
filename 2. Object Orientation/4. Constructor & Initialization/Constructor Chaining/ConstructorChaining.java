public class ConstructorChaining extends Child {
    public ConstructorChaining(){       //A
        this(10);                       //B
        System.out.println("Constructor having no param");//C
    }
    public ConstructorChaining(int x){  //D
        this(10,20);                    //E
        System.out.println("Constructor having x as param:"+x);//F
    }
    public ConstructorChaining(int x,int y){//G
        //H super called by constrcutor
        System.out.println("Constructor having x,y as params:"+x+y);//I
    }
    public static void main(String[] args) {
        new ConstructorChaining();
        //flow
        //A -> B -> D -> E -> G -> H -> I -> F -> C
    }
}
