package CollectionExercisesEx;
import java.util.ArrayList;
public class Collection4 {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        System.out.println(letters);

        ArrayList<String> words = new ArrayList<>();
        words.add("Interface");
        words.add("Implement");
        words.add("extend");
        System.out.println(words);
        System.out.println (letters.addAll(words));
        System.out.println(letters);


        System.out.println(words.add("22"));
    }
}
