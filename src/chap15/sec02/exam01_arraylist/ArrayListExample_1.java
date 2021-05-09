package chap15.sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample_1 {

    public static void main(String[] args) {
        List<String >list = new ArrayList<String >();

       for (int i=1; i<= 20; i++){
           list.add(0,i+"저장");
       }

        System.out.println(list.get(5));


    }
}
