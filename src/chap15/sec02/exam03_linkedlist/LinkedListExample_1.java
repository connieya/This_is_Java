package chap15.sec02.exam03_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample_1 {

    public static void main(String[] args) {
        List<Integer > list1 = new ArrayList<>();
        List<Integer > list2 = new LinkedList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i<10000; i++){
            list1.add(i);
        }
        endTime =System.nanoTime();

        System.out.println("ArrayList 걸린시간 : " + (endTime- startTime));

        startTime = System.nanoTime();
        for (int i = 0; i<10000; i++){
            list2.add(i);
        }
        endTime =System.nanoTime();

        System.out.println("LinkedList 걸린시간 : " + (endTime- startTime));
    }
}
