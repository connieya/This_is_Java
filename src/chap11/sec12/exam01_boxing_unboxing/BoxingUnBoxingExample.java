package chap11.sec12.exam01_boxing_unboxing;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {

        //Boxing - 기본 타입의 값을 포장 객체로 만드는 과정
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("200");
        Integer obj3 = Integer.valueOf("300");

        //Unboxing - 포장 객체에서 기본 타입의 값을 얻어 내는 과정
        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

    }
}
