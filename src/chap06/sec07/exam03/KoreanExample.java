package chap06.sec07.exam03;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "011225-12334567");
        System.out.println("kl.name : " +k1.name);
        System.out.println("kl.ssn : " +k1.ssn);

        Korean k2 = new Korean("김자바", "930525-12334567");
        System.out.println("k2.name : " +k2.name);
        System.out.println("k2.ssn : " +k2.ssn);
    }
}
