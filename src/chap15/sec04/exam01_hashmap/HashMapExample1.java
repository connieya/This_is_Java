package chap15.sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<String ,Integer>();

        map.put("신용권",85);
        map.put("홍길동",90);
        map.put("동장군",80);
        map.put("홍길동",95); // 중복 저장되지 않기 때문에  ,value가 95인 홍길동 키가 저장된다.

        System.out.println("총 엔트리 수 : " +map.size());

        System.out.println("홍길동 : " +map.get("홍길동"));
        System.out.println();

        Set<String >  keySet = map.keySet();
        Iterator<String > keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " +value);
        }
        System.out.println();
        map.remove("홍길동");

        System.out.println("총 Entry 수 : " + map.size());

        // 객체를 하나씩처리
        Set<Map.Entry<String ,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String ,Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()){
            Map.Entry<String ,Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" +key + " : " +value );
        }
        System.out.println();

        // 객체 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());



    }
}
