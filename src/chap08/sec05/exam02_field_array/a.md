# 인터페이스 배열로 구현 객체 관리

이전에는 Car 클래스에서 4개의 타이어 필드를 인터페이스로 각가 선언했지만 다음과 같이
인터페이스 배열로 관리할 수 있다.

```java

Tire[] tires = {
        new HankookTire(),
        new HankookTire(),
        new HankookTire(),
        new HankookTire()
        };
```

frontLeftTire은 tires[0], frontRightTire는  tires[1] , backLeftTire는 tires[2],
backRightTire는 tire[3] 과 같이 인덱스로 표현되므로 대입이나 제어문에서 활용하기 매우 쉽다.
예를 들어 인덱스 1을 이용해서 앞오른쪽 타이어를 KumhoTire 로 교체하기 위해 다음과 같이 작성할 수 있다.
```java
tires[1] = new KumhoTire();
```

tires 배열의 각 항목은 Tire 인터페이스 타입이므로, 구현 객체인 KumhoTire를 대입하면 자동
타입 변환이 발생하기 때문에 아무런 문제가 없다. 구현 객체들을 배열로 관리하면 제어문에서 가장
많이 혜택을 본다. 예를 들어 전체 타이어의 roll() 메소드를 호출하는 Car 클래스의 run() 메소드는
다음과 같이 for문으로 작성할 수 있다.

```java
void run(){
    for(Tire tire : tires){
        tire.roll();
        }
}
```

`Car.java` 필드 다형성

```java

public class Car {

    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire()
    };


    void run(){
        for (Tire tire : tires) {

            tire.roll();
        }
    }
}

```

`CarExample.java` 필드 다형성 테스트

```java
public class CarExample {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();

        myCar.run();
    }
}

```


