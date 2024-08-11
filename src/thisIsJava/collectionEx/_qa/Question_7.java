package thisIsJava.collectionEx._qa;

import java.util.ArrayList;
import java.util.List;

public class Question_7 {
    public static class Board {
        private String title;
        private String content;

        public Board(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public String getTitle() {  return title;  }
        public String getContent() {  return content;  }
    }

    public static class BoardDao {
        public List<Board> getBoardList() {
            List<Board> list = new ArrayList<Board>();
            list.add(new Board("제목1", "내용1"));
            list.add(new Board("제목2", "내용2"));
            list.add(new Board("제목3", "내용3"));
            return list;
        }
    }

    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for (Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
