package Collection11;
import java.util.*;

public class ShuffleList {
    public static void main(String[] args) {
        List<String> flowers = new ArrayList<String>();

        flowers.add("dera");
        flowers.add("whiteRose");
        flowers.add("hybiscus");
        flowers.add("jasmine");
        flowers.add("rose");
        flowers.add("lilly");

        System.out.println("List before shuffling:" + flowers);
        Collections.shuffle(flowers);
        System.out.println("List after shuffling:" + flowers);
    }
}


