public class a2dArray {
    public static void main(String args[]){
        //jagged array of variable column
    int a[][]={
        {3,4},
        
        {5,6,8,7},
        {1,2,3}
    };
    for(int i=0;i<3;i++){
        for(int j=0;j<a[i].length;j++){
            System.out.print(a[i][j] +" ");
        }
       System.out.println(); 
    }
    System.out.printf("\n \n");
//jagged array enhanced for loop 
for(int k1[]: a){
    for(int k2:k1){
        System.out.print(k2 +" ");
    }
    System.out.println();
}

    }
    
}
