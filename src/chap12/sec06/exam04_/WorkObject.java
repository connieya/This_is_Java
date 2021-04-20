package chap12.sec06.exam04_;

public class WorkObject {

    public synchronized void methodA(){
        System.out.println("ThreadA 의 methodA() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodB(){
        System.out.println("ThreadB 의 methodB() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
