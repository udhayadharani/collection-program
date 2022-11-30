package Collection11;
import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> dishes = new ArrayList<String>();
        dishes.add("idly");
        dishes.add("dosa");
        dishes.add("Briyani");
        dishes.add("chappathi");
        dishes.add("boori");
        dishes.add("vadai");

        System.out.println(dishes);
        dishes.remove(2);

        System.out.println("After removing third element from the list:"+dishes);
    }

    }

