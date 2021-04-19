package chap02.sec03.exam01_;

public class PromotionExample {
    public static void main(String[] args) {
        byte byeValue = 127;
        System.out.println("byteValue = " + byeValue);

//        char charValue = byeValue; 컴파일 에러

        int intValue = byeValue;
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드 = "+intValue);

        intValue = 500;
        long longValue = intValue;
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue;
        System.out.println(doubleValue);
    }
}
