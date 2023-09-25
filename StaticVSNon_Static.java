class Demo1{
static int a,b;
int p,q;
{
    System.out.println("control in non_static block ");
    p=10;
    q=20;
}
static {                                                //this block is first to execute 
    System.out.println("control in static block ");
    a=30;
    b=50;
}
void disp1(){
    System.out.println("value of p :"+p);
    System.out.println("value of q :"+q);
}
static void disp2(){
    System.out.println("value of a :"+ a);
    System.out.println("value of b :"+b);
}

}

public class StaticVSNon_Static {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.disp1();
        Demo1.disp2();
    }
    
}
/*1--first static block is executed in the code and its values is initialize  
 2--at time of object creation non_static block is executed 
*/