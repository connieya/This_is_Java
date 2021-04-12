package chap15.sec05.exam02_treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample5 {
    public static void main(String[] args) {

    TreeMap<Integer, String > scores = new TreeMap<>();
        scores.put(new Integer(99), "박건희");
        scores.put(new Integer(91), "홍길동");
        scores.put(new Integer(89), "이순신");
        scores.put(new Integer(79), "신용권");

        NavigableMap<Integer,String > descendingMap = scores.descendingMap();
        System.out.println("descendingMap = " + descendingMap);
        for (Integer integer : descendingMap.keySet()) {
            System.out.print(integer + ",");
        }
    }
}
