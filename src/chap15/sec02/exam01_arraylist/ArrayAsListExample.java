package chap15.sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

    public static void main(String[] args) {
        List<String > list1 = Arrays.asList("신용권","홀길동","감자바"); // 고정된 객체들로 구성된 LIst


        System.out.println(list1);
        for (String s : list1) {
            System.out.println(s);
        }

        System.out.println();
        list1.add("박건희"); // 에러가 발생한다. UnsupportedOperationException
        System.out.println("list1 :" +list1);

        List<Integer> list2 = Arrays.asList(1,2,3);
        System.out.println(list2);




    }
}
