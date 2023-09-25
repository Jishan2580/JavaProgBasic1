class demo1{//extends Object
    void disp(){
        System.out.println("demo1 class");
    }
}
class demo2 extends demo1{
    void disp(){
        super.disp();//this will call demo1 disp() method 
        System.out.println("demo2 class");
    }
}
class demo3 extends demo2{

    void disp(){
        super.disp();//it will call demo2 class disp() method not demo1 method 
        
        System.out.println("demo3 class");
    }
}
public class multilevel_method_overriding{
    public static void main(String[] args) {
        demo3 d =  new demo3();
        d.disp();
        demo1 s= new demo1();
    }
}