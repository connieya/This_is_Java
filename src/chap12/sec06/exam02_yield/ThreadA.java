package chap12.sec06.exam02_yield;

public class ThreadA extends Thread {
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while (!stop){
            if (work){
                System.out.println("ThreadA 작업 내용 ");
            }else {
                Thread.yield();
                // 실행 중에 우선순위가 동일한 다른 스레드에게 실행을 양보하고 실행 대기 상태가 된다.
            }
        }
        System.out.println("ThreadA 종료");
    }
}
