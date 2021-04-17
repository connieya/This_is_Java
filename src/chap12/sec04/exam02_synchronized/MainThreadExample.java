package chap12.sec04.exam02_synchronized;

public class MainThreadExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

//        Thread thread1 = new User1();
        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
    }
}
