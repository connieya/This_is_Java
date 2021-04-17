package chap12.sec02.exam02_threadname;

public class ThreadB extends Thread{
    public ThreadB() {
        setName("나는 쓰레드B");
    }

    @Override
    public void run() {
        for (int i=0; i<6; i++){
            System.out.println(getName()+ "가 출력합니다.");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("ThreadB를  생성한 스레드 : " +Thread.currentThread().getName() );
    }
}
