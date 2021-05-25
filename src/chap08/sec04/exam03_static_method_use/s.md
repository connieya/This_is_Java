# 정적 메소드 사용

인터페이스의 정적 메소드는 인터페이스로 바로 호출이 가능하다. 다음 예제는 RemmoteControl의 
changeBattery() 정적 메소드를 호출한다.

`RemotControl `  인터페이스

```java

public interface RemoteControl {

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){
        if (mute){
            System.out.println("무음 처리합니다");
        }else{
            System.out.println("무음 해제합니다");
        }
    }

    static void changeBattery(){
        System.out.println("건전지를 교환합니다다");    }


}
```


`RemoteControlExample.java`  정적 메소드 사용

```java
public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl.changeBattery();
    }
}


```