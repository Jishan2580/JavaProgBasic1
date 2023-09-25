class A{

    void show(){
        System.out.println("in show ");
    }
    class B{

        void display(){
            System.out.println("in display method");
        }
    }
}




public class MemberInnerClass {
    public static void main(String[] args) {
        A obj = new A();
        //B obj1 = new B(); cant create inner class method
       // obj1.display(); cant directly call display() mtehod
       A.B obj1= obj.new B();
       obj1.display(); 

        obj.show();
    }
    
}
