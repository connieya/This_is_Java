package chap02.sec02.exam02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;

//        long var3 = 100000000000000; 컴파일 에러
        long var4 = 10000000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
