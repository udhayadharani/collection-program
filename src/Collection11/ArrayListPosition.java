package Collection11;
import java.util.ArrayList;

public class ArrayListPosition {
    public static void main(String[] args) {
        ArrayList<String> StringsList = new ArrayList<String>();
        StringsList.add("Audi");
        StringsList.add("BMW");
        StringsList.add("Bugatti");
        StringsList.add("Ford");
        StringsList.add("Honda");
        StringsList.add("Hyundai");

        System.out.println(StringsList);

        StringsList.add(0, "Ferrari");
        StringsList.add(7, "Fiat");

        System.out.println(StringsList);
    }
}