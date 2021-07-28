package chap11.sec03.exam01_equals;

public class MemberExample {

    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 논리적으로 동등합니다.");
        } else {
            System.out.println("obj1과 obj2는 논리적으로 동등하지 않습니다.");
        }

        if (obj1.equals(obj3)) {
            System.out.println("obj1과 obj3은 논리적으로 동등합니다.");
        } else {
            System.out.println("obj1과 obj3은 논리적으로 동등하지 않습니다.");
        }

        System.out.println("obj1의 해쉬코드 : "+ obj1.hashCode());
        System.out.println("obj2의 해쉬코드 : "+ obj2.hashCode());
        obj1 = obj2;
        System.out.println("obj1의 해쉬코드 : "+ obj1.hashCode());
        System.out.println("obj2의 해쉬코드 : "+obj2.hashCode());
        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 물리적으로 등등합니다.");
        } else {
            System.out.println("obj1과 obj2는 물리적으로 동등하지 않습니다.");
        }

        String str1 = "자바";
        String str2 = "자바";
        if (str1.equals(str2)) {
            System.out.println("str1 과 str2는 논리적으로 동등합니다.");
        } else {
            System.out.println("str1 과 str2는 논리적으로 동등하지 않습니다.");
        }

        if (str1 == str2) {
            System.out.println("str1 과 str2 는 물리적으로 동등합니다.");
        }else {
            System.out.println("str1과 str2는 물리적으로 동등하지 않습니다.");
        }
    }
}
