public class StarPattern5 {
public static void main(String args[]){

    for(int i=0 ;i<8; i++){
        for(int j=0 ;j<8; j++){
            if(i==0 && j<4 ||(i>=0 && j==0)||i==7 && j<4 ||j==4 && i>0 && i<7){
                System.out.print("*");
            }
            else 
                System.out.print(" ");
        }
        System.out.println();
    }
}
}
