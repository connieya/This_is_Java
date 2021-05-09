package chap15.sec03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection_1 {
    public static void main(String[] args) {

        Set<String > set = new HashSet<>();

        set.add("박건희");
        boolean add = set.add("박건희");
        set.add("네이버");
        set.add("카카오");
        set.add("쿠팡");
        set.add("라인");
        set.add("배민");
        set.add("당근마켓");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if (str.equals("배민")){

            }
            System.out.println(str);
        }


    }
}
