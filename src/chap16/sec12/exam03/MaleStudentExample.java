package chap16.sec12.exam03;

import chap16.sec11.exam02.MaleStudent;
import chap16.sec11.exam02.Student;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args) {
        List<chap16.sec11.exam02.Student> totalList = Arrays.asList(
                new Student("홍길동",10, Student.Sex.MALE),
                new Student("김수애",6, Student.Sex.FEMALE),
                new Student("신용권",10, Student.Sex.MALE),
                new Student("박수미",6, Student.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.parallelStream().filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(MaleStudent::new,MaleStudent::accumulate, MaleStudent::combine);

        maleStudent.getList().stream().forEach(s -> System.out.println(s.getName()));
    }
}
