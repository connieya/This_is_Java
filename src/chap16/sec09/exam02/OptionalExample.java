package chap16.sec09.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
//        // NoSuchElementException 발생
//        double avg = list.stream()
//                .mapToInt(Integer :: intValue)
//                .average()
//                .getAsDouble();

        // 방법1
        OptionalDouble optional = list
                .stream()
                .mapToInt(Integer :: intValue)
                .average();

        if (optional.isPresent()){
            System.out.println("방법 1_평균 : "+optional.getAsDouble());
        }else {
            System.out.println("방법1_ 평균 : 0.0");
        }

        // 방법2
        double avg2 = list
                .stream()
                .mapToInt(Integer :: intValue)
                .average().orElse(0.0);
        System.out.println("빙밥2_ 평균 :" +avg2);

        //방법3
        list.stream()
                .mapToInt(Integer::intValue).
                average()
                .ifPresent(a -> System.out.println("방법 3_평균: "+a));
    }
}
