package thisIsJava.collectionEx.treeEx;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        // 정렬된 Integer 객체 하나씩 가져와 출력
        for (Integer score : scores) {
            System.out.print(score + " ");
        }
        System.out.println("\n");

        // 특정 Integer 객체 가져오기
        System.out.println("가장 낮은 점수 " + scores.first());
        System.out.println("가장 높은 점수 " + scores.last());
        System.out.println("95점 아래 점수 " + scores.lower(95));
        System.out.println("95점 위의 점수 " + scores.higher(95));
        System.out.println("95점이거나 바로 아래 점수 " + scores.floor(95));
        System.out.println("85점이거나 바로 위의 점수 " + scores.ceiling(85) + "\n");

        // 내림차순 정렬
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer score : descendingScores) {
            System.out.print(score + " ");
        }
        System.out.println("\n");

        // 범위 검색, 80 <=
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for (Integer score : rangeSet) {
            System.out.print(score + " ");
        }
        System.out.println("\n");

        // 범위 검색, 80 <= score < 90
        rangeSet = scores.subSet(80, true, 90, false);
        for (Integer score : rangeSet) {
            System.out.print(score + " ");
        }
    }
}
