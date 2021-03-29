package chap07.sec07.exam02_field_polymorphism;

import chap07.sec06.exam01_protected_access_modifier2.C;

public class CarExample {

    public static void main(String[] args) {
        Car car = new Car();

        for (int i=1; i<=5; i++){
            int problemLocation = car.run();

            switch (problemLocation){
                case 1:
                    System.out.println("앞 왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire(15 , "앞 왼쪽");
                    break;
                case 2:
                    System.out.println("앞 오른쪽 KumhoTire로 교체");
                    car.frontLeftTire = new KumhoTire(13 , "앞오른쪽");
                    break;
                case 3:
                    System.out.println("뒤 왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire(14 , "뒤 왼쪽");
                    break;
                case 4:
                    System.out.println("뒤 오른쪽 KumhoTire로 교체");
                    car.frontLeftTire = new KumhoTire(17 , "뒤 오른쪽");
                    break;
            }

            System.out.println("------------------------------------------------");
        }
    }
}
