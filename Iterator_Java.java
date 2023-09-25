import java.util.*;

public class Iterator_Java {
    public static void main(String[] args) {
        ArrayList al1= new ArrayList();
        al1.add(25);
        al1.add(23);
        al1.add(45);
        al1.add(10);
        System.out.println(al1);
        
        //for loop
       /*  for(int i=0 ;i<al1.size();i++)
        {
            Object o = al1.get(i);
            System.out.println(o);
            //System.out.println(al1.get(i));
        } */

        //for each loop
        /*for(Object o : al1){
            System.out.println(o);
        }*/

        //iterator
        Iterator itr= al1.iterator();
        while(itr.hasNext()){
            Integer o = (Integer) itr.next();
            System.out.println(o);
            System.out.println(itr.next());
        }
        ListIterator litr = al1.listIterator(al1.size());
        System.out.println(litr.previous());
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

    }
    
}
