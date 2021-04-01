package chap11.sec11.exam03_array_sort;

public class Member implements Comparable<Member>{

    String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Member o) {
        return name.compareTo(o.name);
    }
}
