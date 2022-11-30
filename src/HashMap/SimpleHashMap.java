package HashMap;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("swathi",2);
        map.put("selvi",1);
        map.put("udhaya",3);

        System.out.println(map.get("the rank is"+"selvi"));
        map.remove("selvi");
        System.out.println(map.get("selvi"));

        for(String key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
    }
}
