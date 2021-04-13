package chap07.sec03.exam01_parent_constructor_call;

public class Member extends Person{

     String memberId;

    public Member(String memberId) {
        this.memberId = memberId;
    }


    public Member(String name , int no){
        super(name,no);
    }


}
