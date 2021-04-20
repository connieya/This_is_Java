package chap12.sec05;

public class TargetThread extends Thread{
    @Override
    public void run() {
        // 10억번 루필을 돌게 해서 RUNNABLE 상태( 실행 대기)를 유지
        for (long i=0; i<1000000000; i++){

        }

        // 1.5초가 일시정지
        try {
            //TIMED_WAITING(일시 정지) 상태 유지
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 다시 10억 번 루핑으로 RUNNABLE 상태 유지
        for (long i=0; i<1000000000; i++){

        }

    }
}
