import java.util.*;

public class PriorityQueue_java {
    public static void main(String[] args) {
        PriorityQueue pq =new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        System.out.println(pq);
        pq.add(25);//duplicate values are allowed 
        //pq.add("strings")//not allowed
        PriorityQueue obj = new PriorityQueue();
        obj.add("hello ");
        obj.add("world");
        obj.add("jishan");
        obj.add("shaikh");
        System.out.println(obj);
        
        }
    
}
