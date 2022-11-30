package Collection11;
import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("jackFruit");
        fruits.add("grapes");
        fruits.add("strawberry");

        System.out.println("List before sort: "+fruits);
        Collections.sort(fruits);
        System.out.println("List after sort: "+fruits);
    }
    }

