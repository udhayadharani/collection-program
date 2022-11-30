package HashSet;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashset=new HashSet<>();
        hashset.add("application");
        hashset.add("programming");
        hashset.add("interface");
        hashset.add("domine");
        hashset.add("null");
        hashset.add("25");

        System.out.println("contains of the hashset"+hashset);
        System.out.println(hashset.add("naming system"));
        System.out.println(hashset.size());
        System.out.println(hashset.clone());
        System.out.println(hashset.remove("domine"));
        System.out.println(hashset.hashCode());
    }
}
