package chap15.sec03.exam01_hashset;

import java.util.HashSet;

public class HashSetExample3 {

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("박건희",13));
        students.add(new Student("박건희",13));

        System.out.println("총 객체 수 : " +students.size());
    }
}
