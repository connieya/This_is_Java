package chap12.sec06.exam03_join;

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
