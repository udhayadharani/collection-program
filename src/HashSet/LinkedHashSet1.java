package HashSet;
import java.util.LinkedHashSet;


public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer>runs=new LinkedHashSet<>();
        runs.add(34);
        runs.add(56);
        runs.add(23);
        runs.add(78);
        runs.add(62);

        LinkedHashSet<String>name=new LinkedHashSet<>();
        name.add("sachin");
        name.add("raina");
        name.add("sky");
        name.add("dhoni");
        name.add("virat");

        System.out.println(runs);
        System.out.println(runs.containsAll(name));
        System.out.println(runs.size());
        System.out.println(name.add("hardik"));
        System.out.println(runs.removeAll(runs));
        System.out.println(name);



    }
}
