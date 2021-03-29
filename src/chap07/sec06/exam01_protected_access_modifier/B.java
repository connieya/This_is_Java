package chap07.sec06.exam01_protected_access_modifier;

public class B {
    public void method(){
        A a = new A();
        a.field = "value";
        a.method();

    }
}
