abstract class MouseClick{      //abstract is mandatory here
    int x;
    int y;
    void show(){
        System.out.println(x+" "+y);
    }
    abstract void mouseClickListener();
    

    void click(MouseClick m)        //registration to achieve proper abstraction
    {
        m.mouseClickListener();     //developer's method-mouseClickListener() is called by developer only which click action is done
        System.out.println(m);      //programmer is just modifying its implementation
        
    }
    //AJAB JAVA KI GAZAB KAHANI
    // public static void main(String[] args) {
    //     MouseClick mp=new MouseClick(){          //here object of abstract class is created sh*t.

    //         @Override
    //         void mouseClickListener() {
    //             System.out.println("hi");
    //         }
            
    //     };
    //     mp.mouseClickListener();
    // }
}