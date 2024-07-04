package collection.iteratSort;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain {
    public static void main(String[] args) {
        Integer[] arr = {3, 2, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println("Comparator 비교");
        Arrays.sort(arr, new AscComparator());
        System.out.println("AscComparator= " + Arrays.toString(arr));

        Arrays.sort(arr, new DescComparator());
        System.out.println("DescComparator= " + Arrays.toString(arr));
        Arrays.sort(arr, new AscComparator().reversed());
        System.out.println("AscComparator.reversed()= " + Arrays.toString(arr));
    }

    // 오름차순 Comparator
    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1= " + o1 + " o2= " + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }
    // 내림차순 Comparator
    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1= " + o1 + " o2= " + o2);
            // -1을 곱해 양수 -> 음수, 음수 -> 양수 반환으로 내림차순 구현
            return (o2 < o1) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
        }
    }
}
