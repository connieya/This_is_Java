package chap15.sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

    public static void main(String[] args) {
        Set<String > set = new HashSet<String >();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        System.out.println("set = " +set);


        int size =   set.size();

        System.out.println("총 객체 수 : " +size);

        Iterator<String > iterator = set.iterator();
        System.out.println("iterator.next() : " + iterator.next());
        System.out.println("iterator.next() : " + iterator.next());


        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 객체수 : " + set.size());

        for (String s : set) {
            System.out.println("\t" + s );

        }

        set.clear();
        if (set.isEmpty()){
            System.out.println("비어 있음 ");
        }
    }
}
