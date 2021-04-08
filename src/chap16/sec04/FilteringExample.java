package chap16.sec04;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String > names = Arrays.asList(
                "홍길동","신용권","김자바","박건희","신민철","박건희","박건오"
        );

        names.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));

        System.out.println();

        names.stream()
                .distinct()
                .filter(n -> n.startsWith("박"))
                .forEach(n -> System.out.println(n));
    }
}
