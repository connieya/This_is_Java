package chap15.sec05.exam01_treeset;

import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(90);
        scores.add(89);
        scores.add(92);
        scores.add(88);
        scores.add(79);
        scores.add(97);

        Integer score1 = scores.first();
        System.out.println("score1 = "+ score1);

        score1 = scores.last();
        System.out.println("score1 = " +score1);

        score1 = scores.lower(89);
        System.out.println("score1 = " +score1);
    }
}
