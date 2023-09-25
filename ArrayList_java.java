
import java.util.*;


public class ArrayList_java {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();//ArrayList with generics
        al1.add(200);
        al1.add(500);// data is stored in the form of object rather than data
         System.out.println("----------------------------");
        System.out.println("al1 data " +al1);
        
        ArrayList al2 = new ArrayList();//ArrayList without generics
        al2.add(500);
        al2.add(456);
        al2.add("string");
        al2.add("jishan");
        al2.add("shaikh");
        al2.add(10.23);
        al2.add("ali");
        System.out.println("----------------------------" );
        System.out.println("al2 data " +al2);
        
        al2.addAll(al1);//adds the element of al1 after the elements of al2
        System.out.println("----------------------------" );


        System.out.println(" after adding al1 into al2 by al2.addAll() method "+al2);
        al2.add(1,"shaikh");
        System.out.println("----------------------------" );

        
        System.out.println("after adding the element at specified index");
        System.out.println(al2);
        System.out.println("----------------------------" );


        //return true is specified object is there 
        System.out.println(" al2 conatain or not =>  " + al2.contains("jishan"));
        System.out.println("----------------------------" );


        //get the element at particular index
        System.out.println("accessing the element at particular index =>" + al2.get(3));
        System.out.println("----------------------------" );


        //return the index of the specified object 
        System.out.println("get the index of object =>"+ al2.indexOf("shaikh"));
        System.out.println("----------------------------" );


        //return true if array is empty
        System.out.println(" check if array id empty => "+ al2.isEmpty());
        System.out.println("----------------------------" );


        //gives the occurence of the elements
        System.out.println("check how many times the object has occurred in the list => "+ al2.lastIndexOf(500));//2
        System.out.println("check how many times the object has occurred in the list => "+ al2.lastIndexOf("shaikh"));//1
        System.out.println("check how many times the object has occurred in the list => "+ al2.lastIndexOf("0215411"));//-1

    }
    
}
