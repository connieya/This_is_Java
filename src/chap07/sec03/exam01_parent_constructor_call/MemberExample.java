package chap07.sec03.exam01_parent_constructor_call;

public class MemberExample {
    public static void main(String[] args) {
        Member member = new Member("gunny");
        member.name =  "이건희";
        member.memberId = "rich";
        System.out.println("member = " +member.memberId);
        System.out.println("member = " +member.no);
        System.out.println("member = " +member.name);

        System.out.println();

        Member member1  = new Member("박건희",940926);
        member1.memberId =  "dddd";
        System.out.println("member1 = " +member1.memberId);
        System.out.println("member1 = " +member1.no);
        System.out.println("member1 = " +member1.name);
    }
}
