package Java_study;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Heavyweight","El Primo");
        map.put("Thrower", "Tick");
        map.put("Assassin", "Edgar");
        map.put("Supporter", "Byron");

        System.out.println(map.size());
        Set<String> kset = map.keySet();

        Iterator<String> iter = kset.iterator();
        while (iter.hasNext()){
            String key = iter.next();
            String val = map.get(key);
            System.out.println(key + " : " + val );

        }


    }
}
