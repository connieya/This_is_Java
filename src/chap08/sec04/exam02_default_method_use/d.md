# 디폴트 메소드 사용

디폴트 메소드는 인터페이스에 선언되지만, 인터페이스에서 바로 사용할 수 없다. 디폴트 메소드는 추상 메소드가
아닌 인스턴스 메소드이므로 구현 객체가 있어야 사용할 수 있다. 예를 들어 RemoteControl 인터페이스는 
setMute()라는 디폴트 메소드를 가지고 있지만, 이 메소드를 다음과 같이 호출할 수는 없다.

```java
RemoteControl.setMute(true);
```

setMute() 메소드를 호출하려면 RemoteControl의 구현 객체가 필요한데, 다음과 같이 Television 객체를
인터페이스 변수에 대입하고 나서 setMute()를 호출할 수 있다. 비록 setMute()가 Television에 
선언되지는 않았지만 Television 객체가 없다면 setMute()도 호출 할 수 없다.

```java
RemoteCOntrol rc = new Television();
rc.setMute(true);
```
디폴트 메소드는 인터페이스의 모든 구현 객체가 가지고 있는 기본 메소드라고 생각하면 된다.
그러나 어떤 구현 객체는 디폴트 메소드의 내용이 맞지 않아 수정이 필요할 수도 있다. 구현 클래스를 
작성 할 때 디폴트 메소드를 재정의(오버라이딩)해서 자신에게 맞게 수정하면 디폴트 메소드가 호출 될 때 
자신을 재정의한 메소드가 호출된다. 아래 예제를 보면 Audio는 디폴트 메소드를 재정의했다.
Televison과 Audio 중 어떤 객체가 인터페이스에 대입되느냐에 따라서 setMute() 디폴트 메소드의
실행 결과는 달라진다.

`Audio.java` 구현 클래스

```java

public class Audio implements RemoteControl {

    private int volume;
    private boolean mute;

    @Override
    public void turnOn() {

        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {

        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Audio volume : " + this.volume);

    }
    @Override
    public void setMute(boolean mute) {
        this.mute = mute;

        if (mute){
            System.out.println("오디오 무음 처리합니다.");
        }else {
            System.out.println("오디오 무음 해제합니다.");
        }
    }
}

```

`RemoteControlExample.java` 디폴트 메소드 사용

```java
public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.setMute(true);

        rc = new Audio();
        rc.turnOn();
        rc.setMute(true);

    }
}

```
