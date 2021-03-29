package chap08.sec05.exam04_casting;

import chap08.sec05.exam03_method_polymorphism.Vehicle;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    public void checkFare(){
        System.out.println("승차 요금을 체크합니다다");

    }
}
