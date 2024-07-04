package collection.iteratSort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("A", 30);
        MyUser myUser2 = new MyUser("B", 20);
        MyUser myUser3 = new MyUser("C", 10);

        List<MyUser> list = new LinkedList<MyUser>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println(list);

        // 객체 스스로 정렬 메서드를 가지고 있는 list.sort 사용 권장
        // 비교자가 없으므로 자연적 순서로 비교 정렬함
        System.out.println("Comparable 기본 정렬");
        list.sort(null);
        //Collections.sort(list);
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new SortMain2.IdComparator());
        //Collections.sort(list, new SortMain2.IdComparator());
        System.out.println(list);
    }
}
