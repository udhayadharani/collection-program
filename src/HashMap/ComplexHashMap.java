package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ComplexHashMap {
    public static void main(String[] args) {
        Map< CityComplex,Integer>map=new HashMap<>();
        CityComplex chennai=new CityComplex("chennai",60001);
        CityComplex coimbatore=new CityComplex("coimbatore",600005);
        CityComplex trichy=new CityComplex("trichy",60048);
        CityComplex thanjavur=new CityComplex("thanjavur",614625);


        map.put(chennai,1);
        map.put(coimbatore,2);
        map.put(trichy,3);
        map.put(thanjavur,4);

        System.out.println(map.get(thanjavur));
        System.out.println(map.get(new CityComplex("thanjavur",614625)));




    }
}
