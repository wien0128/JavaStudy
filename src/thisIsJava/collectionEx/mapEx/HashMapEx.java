package thisIsJava.collectionEx.mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // Map Collection 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("아무개", 70);
        map.put("홍길동", 95);
        System.out.println("Total Entry Count: " + map.size());
        System.out.println();

        // Key 로 value 얻기
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        // Key Set Collection 을 얻고, 반복해서 key 와 value 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println();

        // Entry Set Collection 을 얻고, 반복해서 key 와 value 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ": " + v);
        }
        System.out.println();

        // key 로 Entry 삭제
        map.remove("홍길동");
        System.out.println("Total Entry Count: " + map.size());
        System.out.println();
    }
}
