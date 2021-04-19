package chap02.sec02.exam02;

public class FloatDoubleExample {
    public static void main(String[] args) {

        double var1 = 4e5;

        System.out.println("var1 = " +var1);

        float var2 = 2e-3f;
        System.out.println("var2 = " +var2);

        // 정밀도 테스트
        double var3 = 0.1234567890123456789;
        float var4 = 0.1234567890123456789f;

        System.out.println("var3 = " +var3);
        System.out.println("var4 = " +var4);
    }
}
