# 다른 생성자 호출(this())

생성자 오버로딩이 많아질 경우 생성자 간의 중복된 코드가 발생할 수 있다. 매개 변수의 수만 달리하고 
필드 초기화 내용이 비슷한 생성자에서 이러한 현상을 많이 볼 수 있다. 이 경우에는 필드 초기화 내용은
한 생성자에만 집중적으로 작성하고 나머지 생성자는 초기화 내용을 가지고 있는 생성자를 호출하는 방법으로 
개선할 수 있다. 생성자에서 다른 생성자를 호출할 때에는 다음과 같이 this() 코드를 사용한다.

```java
클래스(매개변수 ,..){
    this(매개변수, ..., 값,...);
    실행문;
}
```

this()는 자신의 다른 생성자를 호출하는 코드로 반드시 생성자의 첫줄에서만 허용된다. this()의 매개값은
호출되는 생성자의 매개 변수 타입에 맞게 제공해야 한다. this() 다음에는 추가적인 실행문들이 올 수 있다. 
이 말은 호출되는 생성자의 실행이 끝나면 원래 생성자로 돌아와서 다음 실행문을 진행한다는 뜻이다. 
````java
Car(String model){
    this.model = model;
    this.color = "은색";
    this.maxSpeed = 250;
}

Car(String model , String color){
    this.model = model;
    this.color = color;
    this.maxSpeed = 250;
}

Car(String model, String color , int maxSpeed){
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
}
````

위의 코드를 보면 세 개의 생성자 내용이 비슷하므로 앞에 두 개의 생성자에서 this()를 사용해서 
마지막 생성자인 Car(String model , String color , int maxSpeed)를 호출하도록 수정하면 중복 코드를 최소화 할 수 있다.

`Car.java` 다른 생성자를 호출해서 중복 코드 줄이기

```java

public class Car {

    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자
    Car(){

    }

    public Car(String model) {
//        this.model = model;
        this(model,"은색",250);
    }

    public Car(String model, String color) {
//        this.model = model;
//        this.color = color;
        this(model, color , 20);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

```

`CarExample.java` 객체 생성 시 생성자 선택

```java

public class CarExample {

    public static void main(String[] args) {
         Car car1 = new Car();
        System.out.println("car1.company = " +car1.company);
        System.out.println();

        Car car2= new Car("자가용");
        System.out.println("car2.company : " +car2.company);
        System.out.println("car2.model : " +car2.model);
        System.out.println();

        Car car3 = new Car("프로쉐","빨강");
        System.out.println("car3.company = " +car3.company);
        System.out.println("car3.model = " +car3.model);
        System.out.println("car3.color = " +car3.color);
        System.out.println();

        Car car4 = new Car("벤츠","검정",200);
        System.out.println("car4.company : " +car4.company);
        System.out.println("car4.model : " +car4.model);
        System.out.println("car4.color : " +car4.color);
        System.out.println("car4.maxSpeed : " +car4.maxSpeed);
    }
}

```