package chap06.sec06;

public class Person {

    // 필드 ( 클래스 멤버 변수)
   String name;
   String address;
   int ssn;

    public Person(String param) {
        String company = param; // 로컬 변수
        // 생성자가 실행 종료 되면 자동 소멸

        System.out.println("제가 다니는 회사는 : " +company+"입니다.");
    }

    void student_person(int vvv){
        int sno = vvv;
        System.out.println("학번은 : " +sno+"입니다.");
    }
}
