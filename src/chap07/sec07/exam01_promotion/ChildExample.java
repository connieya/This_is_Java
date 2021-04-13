package chap07.sec07.exam01_promotion;

public class ChildExample {

    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();

//        parent.method3(); // 호출 불가능

        Parent parent1 = new Child();
        parent1.method1();
        parent1.method2();
//        parent1.method3();

        System.out.println("----------------------------");
        Child child1 = new Child();
        child1.method1();
        child1.method2();
        child1.method3();

    }
}
