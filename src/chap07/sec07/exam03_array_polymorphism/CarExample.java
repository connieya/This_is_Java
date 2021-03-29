package chap07.sec07.exam03_array_polymorphism;

public class CarExample {

    public static void main(String[] args) {
        Car car = new Car();

        for (int i=1; i<=5; i++){
            int problemLocation = car.run();
            if (problemLocation != 0){
                System.out.println(car.tires[problemLocation-1].location + "HankookTire로 교체");
                car.tires[problemLocation-1] =
                        new HankookTire( 15, car.tires[problemLocation-1].location);
            }
            System.out.println("===================");
        }
    }
}
