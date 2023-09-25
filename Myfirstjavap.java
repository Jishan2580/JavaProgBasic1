class A{
    int t=2002;
    void display(){
        System.out.println("A's method is called");
    }
}
class B extends A{
    int t=403;
    void display(){
        System.out.println("B's method is called");
    }
}

class Myfirstjavap {


    public static void main(String[] args) {
        A a = new B();
        a.display();
        ((B) a).display();
        B b=new B();
        System.out.println(a.t);/*in java variable is accesed through referenced type not object type
        so even a is object of class B but it is reference to A class so here A's variable is accessed */ 
        System.out.println(b.t);
        
        }
    }

    

    