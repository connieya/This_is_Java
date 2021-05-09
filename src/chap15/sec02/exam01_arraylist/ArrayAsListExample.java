package chap15.sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

    public static void main(String[] args) {
        List<String > list1 = Arrays.asList("신용권","홀길동","감자바"); // 고정된 객체들로 구성된 LIst

        int age1 = 50;
        Integer age2 = 50;
        Integer age3 = 50;

        System.out.println("age1 ==age2  = " + (age1==age2));
        System.out.println("age2 ==age3  = " + (age2==age3));

        System.out.println("--------------------------------");


        System.out.println(list1);
        for (String s : list1) {
            System.out.println(s);
        }
//        list1.remove(0); 에러 발생

        System.out.println();
//        list1.add("박건희"); // 에러가 발생한다. UnsupportedOperationException
        System.out.println("list1 :" +list1);

        List<Integer> list2 = Arrays.asList(1,2,3);
        System.out.println(list2);

        System.out.println("===============================");
        System.out.println(list1.get(2));

        System.out.println("------------------");


      List<String > exam = new ArrayList<>();
      exam.add("네이버");
      exam.add("카카오");
      exam.add("쿠팡");
        System.out.println("exam = " + exam);



    }
}
