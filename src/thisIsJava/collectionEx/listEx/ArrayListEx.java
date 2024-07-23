package thisIsJava.collectionEx.listEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("Title1", "Content1", "Writer1"));
        list.add(new Board("Title2", "Content2", "Writer2"));
        list.add(new Board("Title3", "Content3", "Writer3"));
        list.add(new Board("Title4", "Content4", "Writer4"));
        list.add(new Board("Title5", "Content5", "Writer5"));

        int size = list.size();
        System.out.println("List size is: " + size);
        System.out.println();

        Board board = list.get(2);
        System.out.println(board.getSubject() + " " +
                board.getContent() + " " + board.getWriter());

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getSubject() + " " +
                    list.get(i).getContent() + " " + list.get(i).getWriter());
        }
        System.out.println();

        list.remove(2);
        list.remove(2);

        for (Board b : list) {
            System.out.println(b.getSubject() + " " +
                    b.getContent() + " " + b.getWriter());
        }
    }
}
