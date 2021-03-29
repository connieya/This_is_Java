package chap08.sec05.exam03_method_polymorphism;

public class DriverExample {

    public static void main(String[] args) {
        Driver driver = new Driver();

        Vehicle bus = new Bus();
        Vehicle taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
