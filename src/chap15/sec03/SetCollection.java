package chap15.sec03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {

        Set<String > set = new HashSet<>();

        boolean naver1 = set.add("네이버");

        set.add("박건희");
        boolean add = set.add("박건희");
        System.out.println(add);
        for (String x : set){
            System.out.println("x = " +x);
        }


        System.out.println("--------------------------------");
        ArrayList<String > list = new ArrayList<>(2);

        boolean naver = list.add("네이버");
        list.add("박건희");
        list.add("박건희");
        boolean gun = list.add("거니");

        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(gun);
    }
}
