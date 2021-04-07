# NullPointerException

자바 프로그램에서 가장 빈번하게 발생하는 실행 예외는 java.lang.NullPointerException
일 것이다. 이것은 객체 참조가 없는 상태, 즉 null값을 갖는 참조변수로
객체 접근 연산자인 도트(.)를 사용했을 때 발생한다.

````java
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        System.out.println(data.toString());
    }
}

````