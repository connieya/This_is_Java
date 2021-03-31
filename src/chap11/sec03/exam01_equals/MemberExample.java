package chap11.sec03.exam01_equals;

public class MemberExample {

    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)){
            System.out.println("obj1과 obj2는 동등합니다.");
        }else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }

        if (obj1.equals(obj3)){
            System.out.println("obj1과 obj3은 동등합니다.");
        }else{
            System.out.println("obj1과 obj3은 동등하지 않습니다.");
        }

        if (obj1 == obj2){
            System.out.println("obj1과 obj2는 물리적으로 등등합니다.");
        }else{
            System.out.println("obj1과 obj2는 물리적으로 동등하지 않습니다.");
        }
    }
}
