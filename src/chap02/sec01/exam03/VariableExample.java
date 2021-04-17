package chap02.sec01.exam03;

public class VariableExample {
    public static void main(String[] args) {
        int value;

//        System.out.println("value = " + value);
        // 에러 발생 variable value might not have been initialized

        value = 10;

        int result = value + 10;

        System.out.println(result);

    }

}
