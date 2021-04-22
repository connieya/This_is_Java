package chap12.sec06.exam06_stop;

public class PrintThread2 extends Thread {

    @Override
    public void run() {
//        while (true) {
//            System.out.println("실행 중");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("실행 종료");
//        }

        while (true){
            System.out.println("실행 중");
            if (Thread.interrupted()){
                break;
            }
        }
        System.out.println("자원 정리");
        System.out.println("실행 정료");
    }
}
