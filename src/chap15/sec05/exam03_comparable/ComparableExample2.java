package chap15.sec05.exam03_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();

        treeSet.add(new Student("박건희",100));
        treeSet.add(new Student("고길동",92));
        treeSet.add(new Student("홍길동",80));

        Student lee = treeSet.ceiling(new Student("이길동", 92));
        System.out.println("lee  = " + lee);

        Iterator<Student> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.name + " : " +student.score );
        }
    }
}
