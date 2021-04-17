package chap12.sec02.exam02_threadname;

public class ThreadA extends Thread{
    public ThreadA() {
        setName("스레드 A");
    }

    @Override
    public void run() {
        for (int i=0; i<6; i++){
            System.out.println(getName()+ "가 출력합니다.");
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
