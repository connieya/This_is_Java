# Thread 하위 클래스로 부터 생성

작업 스레드가 실행할 작업을 Runnable로 만들지 않고, Thread의 하위 클래스로 작업 스레드를
정의하면서 작업 내용을 포함 시킬 수도 있다. 다음은 작업 스레드 클래스를
정의하는 방법인데, Thread 클래스를 상속한 후 run 메소드를 재정의해서
스레드가 실행할 코드를 작성하면 된다. 작업 스레드 클래스로부터
작업 스레드 객체를 생성하는 방법은 일반적인 객체를 생성하는 방법과 동일하다.

```java
public class WorkerThread extends Thread{
    @Override
    public void run(){
        // 스레드가 실행할 코드
    }
}
Thread thread = new WorkerThread();
```
코드를 좀 더 절약하기 위해 다음과 같이 Thread 익명 객체로
작업 스레드 객체를 생성할 수 도 있다.
```java
Thread thread = new Thread(){
  public void run(){
      스레드가 실행할 코드;
  }  
};
```

이렇게 생성된 작업 스레드 객체에서 start() 메소드를 호출하면 작업 스레드는
자신의 run() 메소드를 실행하게 된다.

```java
thread.start();
```