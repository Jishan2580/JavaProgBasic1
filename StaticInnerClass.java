 class Circle{
    int x,y=15;
    static int r=112;
    public static class Point{
        void display(){
            System.out.println(" we are in point display( ) method ");
            System.out.println(Circle.r);//can only access static data member of outer classs
        }
    }
    
}

public class StaticInnerClass{
    public static void main(String args[]){

        Circle c = new Circle();// not needed in case of static inner class 
        Circle.Point p =  new Circle.Point();// carefully follow new keyword syntax 
        p.display();
        System.out.println(Circle.r);//can only access static data member of outer classs 
        
        
        
    }
}
