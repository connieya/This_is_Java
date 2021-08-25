package chap16.sec11.exam01;

import chap14.sec03.exam01_no_argument_no_return.MyFunctionalInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 12, Student.Sex.FEMALE),
                new Student("박건희", 28, Student.Sex.MALE),
                new Student("권지용", 34, Student.Sex.MALE),
                new Student("신용권", 41, Student.Sex.MALE),
                new Student("홀길순", 22, Student.Sex.FEMALE),
                new Student("코니", 42, Student.Sex.FEMALE)
        );

        HashSet<Student> collect = totalList.stream()
                .filter(student -> student.getSex() == Student.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));


    }
}
