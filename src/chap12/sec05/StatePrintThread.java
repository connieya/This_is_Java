package chap12.sec05;

public class StatePrintThread extends Thread{

    private Thread targetThread;

    public StatePrintThread(Thread targetThread){
        this.targetThread = targetThread;
    }

    @Override
    public void run() {
        while (true){
            Thread.State state = targetThread.getState();  // 스레드 상태 얻기
            System.out.println("타겟 스레드 상태 : " +state);

            if (state == State.NEW){
                targetThread.start();  // 객체 생성 상태일 경우 실행 대기 상태로 만듬
            }

            if (state == State.TERMINATED){
                break;              // 종료 상태일 경우 while 문을 종료 함
            }

            //0.5초 간 일시 정지
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
