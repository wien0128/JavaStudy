package collection.iteratSort;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("A", 30);
        MyUser myUser2 = new MyUser("B", 20);
        MyUser myUser3 = new MyUser("C", 10);

        MyUser[] arr = { myUser1, myUser2, myUser3 };
        System.out.println("기본 데이터\n" + Arrays.toString(arr));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("IdComparator 정렬");
        Arrays.sort(arr, new IdComparator());
        System.out.println(Arrays.toString(arr));

        System.out.println("IdComparator().reversed() 정렬");
        Arrays.sort(arr, new IdComparator().reversed());
        System.out.println(Arrays.toString(arr));
    }

    public static class IdComparator implements Comparator<MyUser> {
        @Override
        public int compare(MyUser o1, MyUser o2) {
            return o1.getId().compareTo(o2.getId());
        }
    }
}
