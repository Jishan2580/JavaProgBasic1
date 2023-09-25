public class LaunchStatic1 {
    static int a ;
    static {
        System.out.println("static block");
        a=10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("main method ");
                System.out.println(a);
    
    }
    
}
