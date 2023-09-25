import java.util.Scanner;

public class StarPattern3 {
    public static void main(String args []){
        System.out.println("enter even number ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        
         if(a%2==0){

        for(int i =0 ;i<a;i++){
            for(int j=0;j<a;j++){
                if(i==0 || i==(a/2)){
                    System.out.print("*");
                }
                else if(j==0 || j==(a-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
    else
        System.out.println("enter even nmber");
    }
    
}
