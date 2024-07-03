package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("sA", 50);
        System.out.println(map);

        // sA가 없는 경우에만 추가
        if (!map.containsKey("sA")) {
            map.put("sA", 100);
        }

        // sA가 없는 경우에만 추가
        map.putIfAbsent("sA", 100);
        map.putIfAbsent("sB", 100);
        System.out.println(map);
    }
}
