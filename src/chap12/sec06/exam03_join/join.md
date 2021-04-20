## 다른 스레드의 종료를 기다림 - join()

스레드는 다른 스레드와 독립적으로 실행하는 것이 기본이지만 다른 스레드가 종료될 때까지 
기다렸다가 실행해야 하는 경우가 발생할 수도있다. 예를 들어 계산 작업을 하는 스레드가
모든 계산 작업을 마쳤을 때, 계산 결과값을 받아 이용하는 경우가 이에 해당된다.



`SumThread.java`


```java
public class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i=1; i<100; i++){
            sum += i;
        }
    }
}



```

JoinExample의 main 스레드와 SumThread 가 있다. 

main 스레드에서 SumThread 스레드를 start로 실행 시킬 수도있고
join() 메서드를 사용해서 SumThread 가 종료 할 때 까지 일시 정지 할 수 있다. 
(main 스레드가 일시 정지 하는 것임 )

`JoinExample.java`

```java
public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();

        sumThread.start();

        System.out.println("1~100 합 : " +sumThread.getSum());

        try {
            sumThread.join(); // sumThread 가 종료 될 때까지 메인 스레드를 일시 정지 시 킴
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 메인 스레드가 원래 출력해야하는데 join 으로 인해 sumThread 가 종료되면 출력한다.
        System.out.println("1~100 합 : " +sumThread.getSum());
    }
}
```
