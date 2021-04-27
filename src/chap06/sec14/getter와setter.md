# Getter 와 Setter 메소드

일반적으로 객체 지향 프로그래밍에서 객체의 데이터는 객체 외부에서 직접적으로 
접근하는 것을 막는다. 그 이유는 객체의 데이터를 외부에서 마음대로 읽고 변경할 경우

객체의 무결성(결점이 없는 성질) 이 깨어질 수 있기 때문이다.

예를 들어 자동차의 속도는 음수가 될 수 없는데, 외부에서 음수로 변경하면 객체의 
무결성이 깨진다. 실제로 다음 코드는 Car 객체의 speed 필드값을 -100으로 변경시킨다.

```java
myCar.speed = -100;
```

이러한 문제점을 해결하기 위해 객체 지향 프로그래밍에서는 메소드를 통해서 데이터를
변경하는 방법을 선호한다. 데이터는 외부에서 접근할 수 없도록 막고 메소드는 
공개해서 외부에서 메소드를 통해 데이터에 접근하도록 유도한다. 그 이유는 메소드는
매개값을 검즈해서 유효한 값만 데이터로 저장할 수 있기 때문이다. 이러한 역할을
하는 메소드가 Setter이다. 예를 들어 자동차의 속도를 setSpeed() 메소드로
변경할 경우 다음과 같이 검증 코드를 작성할 수 있다. 

```java
void setSpeed(double spped){
    if(speed < 0){
        this.speed = 0;
        return;
    }else {
        this.speed = speed;    
    }
}
```

매개값이 음수 일 경우 speed 필드에 0으로 저장하고, 메소드 실행 종료

외부에서 객체의 데이터를 읽을 때도 메소드를 사용하는 것이 좋다. 객체 외부에서 객체의
필드값을 사용하기에 부적절한 경우도 있다. 이런 경우에는 메소드로 필드값을 가공한 후
외부로 전달하면 된다. 이런 메소드가 바로 Getter이다. 예를 들어 자동차의 속도를
마일에서 KM 단위로 환산해서 외부로 리턴해주는 getSpeed() 메소드를 다음과 같이
작성할 수 있다.

```java
double getSpeed(){
    double km = speed*1.6;
    return km;
    
}
```
필드값인 마일을 km 단위로 환산 후 외부로 리턴


클래스를 선언할 때 가능하다면 필드를 private 로 선언해서 외부로부터 보호하고,
필드에 대한 Setter 와 Getter 메소드를 작성해서 필드값을 안전하게 변경/사용하는 것이 좋다.

다음은 Setter 와 Getter 메소드를 선언하는 방법을 보여준다. 
검증 코드나 변환 코드는 필요에 따라 추가해야 한다.


```java
private 타입 fieldName;

//Getter
public 리턴 타입ㅂ getFieldName(){
    return fieldName;
}

// Setter
public void setFieldName(타입 fieldName){
    this.fieldName = fieldName;    
}
```

필드 타입이 boolean 일 경우에는 Getter는 get으로 시작하지 않고 is로 시작하는 것이
관례이다.

예를 들어 stop 필드의 Getter 와 Setter 는 다음과 같이 작성할 수 있다.

```java
private boolean stop;

//Getter 
public boolean isStop(){
    
    return stop;    
}

//Setter
public void setStop(boolean stop){

        this.stop = stop;
}
```

먄약 외부에서 필드값을 읽을 수만 있고 변경하지 못하도록 하려면(읽기 전용) Getter 메소드만
선언해도 좋고, 아니면 Setter 메소드를 private 접근 제한을 갖도록 선언해도 좋다.


`Car.java`

```java

public class Car {

    //필드
    private int speed;
    private boolean stop;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0){
            this.speed = 0;
            return;
        }
        this.speed = speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}

```

`CarExmaple.java`  Getter 와 Setter 메소드 사용

```java
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        //잘못된 속도 변경
        myCar.setSpeed(-50);

        System.out.println("현재 속도 : " +myCar.getSpeed());

        // 올바른 속도 변경
        myCar.setSpeed(60);

        // 멈춤
        if (!myCar.isStop()){
            myCar.setStop(true);
        }

        System.out.println("현재 속도 : " +myCar.getSpeed());
    }

```