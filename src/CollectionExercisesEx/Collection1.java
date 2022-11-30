package CollectionExercisesEx;
import java.util.*;
public class Collection1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("selvi");
        list1.add("udhaya");
        list1.add("nandhini");
        list1.add("vicky");

        Iterator s = list1.iterator();

        while (s.hasNext()) {
            System.out.println(s.next());
        }
        list1.remove("nandhini");
        System.out.println(list1);

        list1.contains("selvi");
        System.out.println(list1);

           list1.remove(1);
           System.out.println(list1);

           list1.clear();
           System.out.println(list1);

    }

}
