package chap15.sec05.exam04_comparator;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample3 {

    public static void main(String[] args) {
       /* TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
        // Fruit이 Comparable을 구현하지 않았기 때문에 예외발생
        treeSet.add(new Fruit("포도",3000));
        treeSet.add(new Fruit("수박",1000));
        treeSet.add(new Fruit("딸기",6000));

        System.out.println("treeSet = " +treeSet);*/

        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
//        System.out.println("treeSet = " + treeSet.comparator());
        System.out.println();
        Iterator<Fruit> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + ": " +fruit.price);
        }
    }
}
