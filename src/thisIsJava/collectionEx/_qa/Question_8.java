package thisIsJava.collectionEx._qa;

import java.util.HashSet;
import java.util.Set;

public class Question_8 {
    public static class Student {
        public int studentNum;
        public String name;

        public Student(int studentNum, String name) {
            this.studentNum = studentNum;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return studentNum;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Student))
                return false;

            Student student = (Student) obj;

            if (studentNum != student.studentNum)
                return false;

            return true;
        }
    }

    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "hhh"));
        set.add(new Student(2, "aaa"));
        set.add(new Student(1, "eee"));

        System.out.println("저장된 객체 수: " + set.size());
        for (Student s : set) {
            System.out.println(s.studentNum + ":" + s.name);
        }
    }
}
