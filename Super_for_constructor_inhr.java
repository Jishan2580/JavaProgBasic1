class point1{
    int a,b,c,d;
    point1(){
        System.out.println("parent non parameterized onstructor");
        a=2;b=3;
    }
    point1(int c,int d){
        System.out.println("parent parameterized constr");
        this.c=c;
        this.d=d;
    }
    class point2 extends point1{
        int z;
        point2(){
            super();
            System.out.println("child non parameterized ");
             z=90;
        }
        point2(int x, int y, int z){
            super(x,y);
            System.out.println("child parameterized ");

            this.z=z;
        }

    }
}



public class Super_for_constructor_inhr {
public static void main(String[] args) {
    point2 p = new point2();
    point2 p2= new point2(10,20,30);
}    
}
