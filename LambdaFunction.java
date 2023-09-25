
@FunctionalInterface
//there can be only one function in functional interface
interface Marks{
   // public void show();
   public void average(int a, int b);
}

public class LambdaFunction{
    public static void main(String[] args) {
        /* 
        This is use for void Show()
        Marks obj = () ->
            System.out.println("we are in 0 parameterised lambda function");
            obj.show();
           */ 
          Marks obj = (int a,int b) ->{
            System.out.println((a+b)/2);
          };
        obj.average(4,5);
    }
}