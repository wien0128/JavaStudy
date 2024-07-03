package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("sA", 90);
        map.put("sB", 80);
        map.put("sC", 70);
        map.put("sD", 100);
        System.out.println(map);

        Integer res = map.get("sC");
        System.out.println("res= " + res);

        // 키 목록 조회
        System.out.println("keySet 활용");
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println("key= " + key + ", value= " + value);
        }

        // 키와 값 쌍 목록 조회
        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for (Map.Entry<String, Integer> e : entry) {
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println("key= " + key + ", value= " + value);
        }
        
        // 값 목록 조회
        System.out.println("values 활용");
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("value= " + value);
        }

        // 람다식을 이용한 키-값 쌍 목록 조회
        map.forEach((k, v) -> System.out.println("key= " + k + ", value= " + v));
    
        // 키가 존재하지 않을 때 기본 값 반환
        System.out.println(map.getOrDefault("sF", 0));

        // 키가 존재하지 않을 경우 지정된 함수(람다)에 의해 값 계산 후 추가
        map.computeIfAbsent("sF", k -> 10);
        System.out.println(map.get("sF"));
        // 키가 존재할 경우 지정된 함수(람다)에 의해 값 계산 후 업데이트
        map.computeIfPresent("sF", (k, v) -> v * 3);
        System.out.println(map.get("sF"));
        // 키의 현재 값에 따라 새로운 값을 계산 후 추가
        map.compute("sE", (k, v) -> (v == null) ? 20 : v + 20);
        System.out.println(map.get("sE"));

        // 키가 존재하면 지정된 함수를 사용하여 값을 병합, 존재하지 않으면 새로운 값을 추가
        map.merge("sB", 10, Integer::sum);
        System.out.println(map.get("sB"));

        // 스트림 API를 사용하여 특정 조건을 만족하는 키나 값을 필터링하거나 매핑 가능
        map.entrySet().stream()
                .filter(e -> e.getValue() < 50)
                .forEach(e -> System.out.println("key= " + e.getKey() + ", value= " + e.getValue()));
        
        // 스트림 API를 이용한 맵의 값 합산
        int sum = map.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("SumOfValues= " + sum);
    }
}
