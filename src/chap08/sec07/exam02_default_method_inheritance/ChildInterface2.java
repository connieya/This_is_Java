package chap08.sec07.exam02_default_method_inheritance;

public interface ChildInterface2 extends ParentInterface{

    @Override
    public default void method2() {
        System.out.println("부모 디폴트 메소드 자식 인터페이스2가 재정의 함");
    }

    public void method3();
}
