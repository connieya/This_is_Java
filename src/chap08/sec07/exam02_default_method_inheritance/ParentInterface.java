package chap08.sec07.exam02_default_method_inheritance;

public interface ParentInterface {

    public void method1();

    public default void method2() {
        System.out.println("부모 인터페이스 디폴트 메소드 입니다~");
    }
}
