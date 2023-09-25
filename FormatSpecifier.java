import java.util.Scanner;

public class FormatSpecifier {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%013x",s1,x);
                System.out.println();
            }
            System.out.println("================================");

    }
    
}
