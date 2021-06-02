# 클래스 상속

현실에서 상속은 부모가 자식을 선택해서 물려주지만, 프로그램에서는 자식이 부모를 선택한다. 자식 클래스를 선언할 때
어떤 부모 클래스를 상속받을 것인지를 결정하고 선택된 부모 클래스는 다음과 같이 extends뒤에 기술한다.

다른 언어와는 달리 자바는 다중 상속을 허용하지 않는다. 즉 여러 개의 부모 클래스를 상속할 수 없다.
그러므로 다음과 같이 extends 뒤에는 단 하나의 부모 클래스만 와야 한다.

```java
class 자식 클래스 extends 부모클래스1, 부모클래스2 <===== X
```

`CellPhone.java` 부모 클래스

```java

public class CellPhone {

    String model;
    String color;

    void powerOn(){
        System.out.println("전원을 켭니다.");
    }

    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    void bell(){
        System.out.println("벨이 울립니다.");
    }

    void sendVoice(String message){
        System.out.println("자기 : " + message);
    }

    void receiveVoice(String message){
        System.out.println("상대방 : " +message);
    }

    void hangUp(){
        System.out.println("전화를 끊습니다.");
    }

}

```

`DmbCellPhone.java` 자식 클래스

```java

public class DmbCellPhone extends CellPhone {

    int channel;


    DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb(){
        System.out.println("채널 " +channel+"번 DMB 방송 수신을 시작합니다.");
    }

    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("채널 " +channel+"번으로 바꿉니다.");
    }

    void turnOffDmb(){
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }

}
```

`DmbCellPhoneExample.java` 자식 클래스 사용

```java

public class DmbCellPhoneExample {

    public static void main(String[] args) {

        // DmbCellPhone 객체 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);

        // CellPhone으로부터 상속받은 필드
        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);

        // DmbCellPhone의 필드
        System.out.println("채널 : " + dmbCellPhone.channel);

        
        //CellPhone으로 부터 상속받은 메서드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
        dmbCellPhone.sendVoice("아~ 네 반갑습니다.");
        dmbCellPhone.hangUp();


        // DmbCellPhone의 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(14);
        dmbCellPhone.turnOffDmb();

    }
}

```