package chap07.sec02.exam01_inheritance;

public class DmbCellPhoneExample2 {

    public static void main(String[] args) {
        CellPhone dmbCellPhone  =  new DmbCellPhone("아이폰","골드",21);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
        dmbCellPhone.sendVoice("아~ 네 반갑습니다.");
        dmbCellPhone.hangUp();




    }
}
