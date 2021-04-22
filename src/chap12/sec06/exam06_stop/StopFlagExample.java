package chap12.sec06.exam06_stop;

public class StopFlagExample {
    public static void main(String[] args) {

        PrintThread1 printThread1 = new PrintThread1();

        printThread1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printThread1.setStop(true);

    }
}
