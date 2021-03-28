package chap15.sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

    public static void main(String[] args) {
        List<String > list1 = Arrays.asList("신용권","홀길동","감자바");


        System.out.println(list1);


        List<Integer> list2 = Arrays.asList(1,2,3);
        System.out.println(list2);

    }
}
