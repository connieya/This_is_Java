package chap13.sec04.exam01_generic_method;

public class BoxingMethodExample {

    public static void main(String[] args) {
        Box<Integer> box = Util.<Integer>boxing(100);
        int intValue = box.getT();
        System.out.println(intValue);
    }
}
