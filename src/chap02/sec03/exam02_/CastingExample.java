package chap02.sec03.exam02_;

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) intValue;

        System.out.println(charValue);

        long longValue = 500;

        intValue = (int) longValue;

        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);

        longValue = 12340000004L;

        intValue = (int) longValue;

        System.out.println(intValue);

        int intValue2 = 150;

        byte byteValue = (byte) intValue2;
        System.out.println("byteValue = " + byteValue);

        intValue2 = 262;

        byteValue = (byte) intValue2;
        System.out.println("byteValue = " + byteValue);
    }
}
