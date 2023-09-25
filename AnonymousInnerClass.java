interface Car{
    void drive();

}
/*class Wagonr implements Car{
    public void drive(){
        System.out.println("Driving...");
    }
} */


public class AnonymousInnerClass {
    public static void main(String[] args) {
        //Car obj = new Wagonr();
        //obj.drive();

        Car obj = new Car()
        {
            public void drive(){
                System.out.println("Driving...");
            }
        };
        obj.drive();
    }
    
}
