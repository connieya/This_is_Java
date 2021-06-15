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

Runnable 을 생성하지 않고 Thread의 하위 클래스로 작업 스레드를
정의해보자

```java
//Thread의 하위 클래스로서 스레드 생성
public class BeepThread extends Thread {
    @Override
    public void run() {
        // 비프음 5번 반복해서 소리나게 하는 작업
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

다음은 BeepThread 클래스를 이용해서 작업 스레드 객체를
생성하고 실행한다.

`BeepPrinitExample3.java`  메인 스레드와 작업 스레드가 동시에 실행

```java

public class BeepPrintExample3 {
    // JVM 에 있는 메인 스레드가 실행한다.
    public static void main(String[] args) {
      
       Thread beepThread = new BeepThread();
       beepThread.start();
      

        // 띵 문자열을 5번 출력하는 작업
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```
BeepThread 객체를 생성하고, start() 메소드를 호출하여 
BeepThread가 run() 메소드를 실행하도록 했다. 그와 동시에
메인 스레드는 for문을 실행시켜 0.5초 간격으로 "띵"을 프린팅한다.

다음은 작업 스레드를 만들수 있는 또 다른 방법이다.

```java
 Thread thread = new Thread(){
            @Override
            public void run() {
                // 비프음 5번 반복해서 소리나게 하는 작업
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i= 0; i<5; i++){
                    toolkit.beep();

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
       
```