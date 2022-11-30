package CollectionExercisesEx;
import java.util.*;
public class Collection2 {
    public static void main(String[] args) {
       LinkedList<Integer>mark=new LinkedList<Integer>();
       mark.add(56);
       mark.add(78);
       mark.add(95);
       mark.add(93);
       mark.add(89);


       System.out.println(mark.get(3));

        mark.set(1,90);
        System.out.println(mark);

        mark.size();
        System.out.println(mark);

        mark.clear();
        System.out.println(mark);
    }
}
