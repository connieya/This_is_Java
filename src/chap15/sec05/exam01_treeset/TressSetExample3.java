package chap15.sec05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TressSetExample3 {

    public static void main(String[] args) {
        TreeSet<String > treeSet = new TreeSet<String>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("c~m 사이의 단어 검색 : ");
        NavigableSet<String> rangeSet = treeSet.subSet("c", true, "m", true);
        for (String word : rangeSet) {
            System.out.println(word);
        }
        System.out.println();
        NavigableSet<String > headSet = treeSet.headSet("guess",false);
        for (String s : headSet) {
            System.out.print(s + " ,");
        }

    }
}
