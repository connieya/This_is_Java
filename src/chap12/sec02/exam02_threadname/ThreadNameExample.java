package chap12.sec02.exam02_threadname;

public class ThreadNameExample {
    public static void main(String[] args) {

        Thread threadA = new ThreadA();
        System.out.println("ThreadA를 생성한 스레드 :" +Thread.currentThread().getName());
        threadA.start();

        Thread thread = Thread.currentThread();
        String name = thread.getName();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("프로그램 시작 스레드 이름 : " +name);



        Thread threadB = new ThreadB();
        System.out.println("작업 스레드 이름 : " +threadB.getName());
        threadB.start();
    }
}
