package chap07.sec07.exam05_casting;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent;
        parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        /*
        parent.field2 = "data2"; //불가능
        parent.method3(); // 불가능
        */

        Child child;
        child = (Child) parent;

        child.field2 = "yyy";
        child.method3();

    }
}
