package chap08.sec05.exam04_casting;

import chap08.sec05.exam03_method_polymorphism.Vehicle;

public class VehicleExample {

    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkFare();

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();
    }
}
