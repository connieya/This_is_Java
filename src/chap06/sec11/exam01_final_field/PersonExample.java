package chap06.sec11.exam01_final_field;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567","계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

//        p1.nation = "USA";
//        p1.ssn = "123422-31321";
        p1.name = "을지 문덕";
        System.out.println(p1.name);
    }
}
