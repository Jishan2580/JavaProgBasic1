interface A{
    int a =23;
    void show();
}
class B implements A{
    public void show(){
        System.out.println("hello world ");
    }
}
class C extends B {
   public void show(){
    super.show();
        System.out.println("we are in class B");
    }

}

public class Interface_basic1{
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        System.out.println(A.a);
    }
}