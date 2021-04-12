package chap15.sec03.exam01_hashset;

import java.util.Objects;

public class Student {

    private String name;
    private int sno;

    public Student(String name, int sno) {
        this.name = name;
        this.sno = sno;


    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return sno == student.sno && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, sno);
//    }
}
