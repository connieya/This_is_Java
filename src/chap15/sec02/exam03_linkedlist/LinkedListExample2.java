package chap15.sec02.exam03_linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String[] args) {

        List<String> list1 = new LinkedList<>();

        list1.add("박건희");
        list1.add("박건오");
        list1.add("권지용");
        list1.add("박재범");
        list1.add("정기석");

        System.out.println("list1 : " + list1);

        list1.add(2,"아이유");
        System.out.println("list1 : " + list1);

        list1.remove(1);
        System.out.println("list1 : " + list1);

        System.out.println("list1.get(1) :"+ list1.get(1));
        System.out.println("list1.get(2) :"+ list1.get(2));

        System.out.println("---------");

        list1.remove(3);

        System.out.println("list1.get(1) :"+ list1.get(1));
        System.out.println("list1.get(2) :"+ list1.get(2));

        list1.remove(2);

        System.out.println("list1 : " + list1);

        System.out.println("list1.get(1) :"+ list1.get(1));
        System.out.println("list1.get(2) :"+ list1.get(2));

    }

}
