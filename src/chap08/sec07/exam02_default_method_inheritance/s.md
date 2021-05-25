# 디폴트 메소드가 있는 인터페이스 상속

인터페이스 간에도 상속이 있다는 것을 이미 학습했었다. 부모 인터페이스에 디폴트 메소드가 정의 되어 있을 
경우, 자식 인터페이스에서 디폴트 메소드를 활용하는 방법은 다음 세 가지가 있다.

- 디폴트 메소드를 단순히 상속만 받는다.
- 디폴트 메소드를 재정의(Override)해서 실행 내용을 변경한다.
- 디폴트 메소드를 추상 메소드로 재선언한다.

다음과 같이 추상 메소드와 디폴트 메소드가 선언된 ParaentInterface가 있다고 가정해보자

````java
public interface ParentInterface {

    public void method1();

    public default void method2() {
        System.out.println("부모 인터페이스 디폴트 메소드 입니다~");
    }
}

````

다음 ChildInterface1은 ParentInterface를 상속하고 자신의 추상 메소드인 method3()을 선언한다.

`ChildInterface1.java` 자식 인터페이스

```java
public interface ChildInterface1 extends ParentInterface{

    public void method3();
}

```

이 경우 ChildInterface1 인터페이스를 구현하는 클래스는 method()1과 method3()의 실체 
메소드를 가지고 있어야 하며 ParentInterface의 method2()를 호출할 수 있다.

```java
ChildInterface1 ci1 = new ChildInterface1(){
        @Override
        public void method3() {}
        
        @Override
        public void method1() {}
        
        ci1.method1();
        ci1.method2(); ParentInterface의 method2() 호출
        ci1.method3();
    
}
```

다음 ChildInterface2는 ParentInterface를 상속하고 
ParentInterface의 디폴트 메소드인 method2()를 재정의한다. 그리고
자신의 추상 메소드인 method3()을 선언한다.

`ChildInterface2.java` 자식 인터페이스

```java
public interface ChildInterface2 extends ParentInterface{

    @Override
    public default void method2() {
        System.out.println("부모 디폴트 메소드 자식 인터페이스2가 재정의 함");
    }

    public void method3();
}

```

이 경우도 ChildInterface2 인터페이스를 구현한 클래스는 method1()과 method3()의 실체
메소드를 가지고 있어야 하며, ChildInterface2에서 재정의한 method2()를 호출할 수 있다.

```java
ChildInterface2 ci2 = new ChildInterface2(){
        @Override
        public void method3() {}
        
        @Override
        public void method1() {}
        
        ci2.method1();
        ci2.method2(); ParentInterface의 method2() 호출
        ci2.method3();
    
```

다음 ChildInterface3은 ParentInterface를 상속하고 ParentInterface의 디폴트 메소드인 
method2()를 추상 메소드로 재선언한다. 그리고 자신의 추상 메소드인 method3()을 선언한다.

```java
public interface ChildInterface3 extends ParentInterface{

    @Override
    public void method2();

    public void method3();
}

```

이 경우 ChildInterface3 인터페이스를 구현하는 클래스는 method1()과 method2(), method3()
의 실체 메소드를 모두 가지고 있어야 한다.

```java
ChildInterface3 ci3 = new ChildInterface3(){


@Override
public void method1(){

        }

@Override
public void method2(){

        }

@Override
public void method3(){

        }
};

ci3.method1();
c13.method2(); // ChildInterface3 구현 객체의 method2() 호출 
ci3.method3();
```