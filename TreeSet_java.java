import java.util.*;

public class TreeSet_java {
    public static void main(String[] args) {
        
    
    TreeSet ts= new TreeSet();
    ts.add(100);
    ts.add(50);
    ts.add(150);
    ts.add(25);
    ts.add(75);
    ts.add(125);
    ts.add(175);
    System.out.println(ts);

    ts.add(25);//duplicatin is not allowed 

    System.out.println("after adding duplicate value " + ts);
    System.out.println("using comparator method "+ts.comparator());//return the comparator used in order
    System.out.println( " subset of collection is " +ts.subSet(40,150));//return the subset
   // System.out.println(ts.subSet(175,25));//runtime exception 
    System.out.println( " tailset of collection is " +ts.tailSet(50));//return all element from 50(including 50) till end

System.out.println( " higher method of collection is " +ts.higher(40));//return only one value higher 

}
}