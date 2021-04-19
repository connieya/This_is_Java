package chap02.sec03.exam03_;

public class OperationsPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
//        byte byteValue3 = byteValue1 + byteValue2;  컴파일 에러
        byte byteValue3 = (byte) (byteValue1 + byteValue2);
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(byteValue3);
        System.out.println(intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;

//        char charValue3 = charValue1 + charValue2; 컴파일 에러
        System.out.println(charValue2);
        char charValue3 = (char) (charValue1 + charValue2);
        System.out.println(charValue3);
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드 = "+intValue2);
        System.out.println("출력문자 = "+(char)intValue2);

        int intValue5 = 10;
        int intValue6 = 10 / 4;
//        int intValue7 = 10 / 4.0; // 컴파일 에러
        System.out.println("intValue6 = " +intValue6);
        double doubleValue = intValue5 /4.0;
        System.out.println("doubleValue = " +doubleValue);

    }
}
