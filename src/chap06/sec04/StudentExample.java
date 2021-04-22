package chap06.sec04;

public class StudentExample {
    public static void main(String[] args) {
        Student s1;
        s1 = new Student(); //객체가 메모리 힙 영역에 생성된다. , 객체의 주소를 리턴한다.
        System.out.println("s1 변수가 Student 객체를 참조합니다. ");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다. ");

    }
}
