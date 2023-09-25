import java.util.Scanner;  
public class Exercise1_2 {
       public static void main(String[] args) {
          Scanner s = new Scanner(System.in); 
          int x = s.nextInt(); 
          int y = s.nextInt();
          int z = s.nextInt();
          int result = 0;
          if(x>y && x>z){
            System.out.println(x+"is greater");
          }
          if(y>x && y>z){
            System.out.println(y+"is greater");
          }
          else
            	System.out.println(z +"is greater");
                 }
          }