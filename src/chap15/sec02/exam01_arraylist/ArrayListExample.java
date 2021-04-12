package chap15.sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String >list = new ArrayList<String >();

        list.add("java");
        list.add("jdbc");
        list.add("Servlet/JSP");
        list.add(2,"Database");

        list.add(1,"iBATIS");
        System.out.println(list);
        System.out.println("==============");
        System.out.println("list.get(1) :" +list.get(1));

        list.remove(1);
        System.out.println("list.get(1) :" +list.get(1));
        list.remove("java");
        System.out.println("list.get(1) :" +list.get(1));

        for (int i=0; i< list.size();i++){
             String  str = list.get(i);

            System.out.println(str);
        }
        System.out.println("===================");
        list.add(1,"JPA");
        System.out.println("list.get(1) :" +list.get(1));
        System.out.println("list = " +list);

    }
}
