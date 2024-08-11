package thisIsJava.collectionEx._qa;

import java.util.TreeSet;

public class Question_10 {
    public static class Student implements Comparable<Student> {
        public String id;
        public int score;

        public Student(String id, int score) {
            this.id = id;
            this.score = score;
        }

        @Override
        public int compareTo(Student o) {
            if (score < o.score) {
                return -1;
            } else if (score == o.score) {
                return 0;
            } else {
                return 1;
            }
            // return Integer.compare(this.score, o.score);
        }
    }

    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();

        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));

        Student student = treeSet.last();
        System.out.println("Max Score: " + student.score);
        System.out.println("Max Score ID: " + student.id);
    }
}
