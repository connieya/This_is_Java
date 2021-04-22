package chap06.sec06;

public class PersonExample {
    public static void main(String[] args) {
        Person person = new Person("엔로비");

        person.name = "박건희";


        System.out.println("이름 : " + person.name);

        person.student_person(1306948);
    }
}
