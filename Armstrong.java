import java.util.Scanner;
class Armstrong{
    public static void main(String args[]){
        int c =0,rem,arm=0;
        Scanner scan = new Scanner(System.in);
         System.out.println( " enter some number");
        int a = scan.nextInt();
        c=a;
        while(a>0){
            rem=a%10;
            arm +=(rem*rem*rem);
            a = a/10;
        }
        if(c==arm)
            System.out.println( c +" is aramstrong number");
        else
             System.out.println( c +" is not aramstrong number");

    }
}