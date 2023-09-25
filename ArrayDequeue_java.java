
import java.util.*;
public class ArrayDequeue_java {
    public static void main(String[] args) {
        ArrayDeque obj = new ArrayDeque();
        obj.add(100);
        obj.add(200);
        obj.add(300);
        obj.add(100);//dulicates are allowed
        obj.addFirst("jishan");//add to the first of the queue
        obj.addLast("shaikh");
        System.out.println(obj);

    }
    
}
