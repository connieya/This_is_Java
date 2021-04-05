package chap07.sec08.exam03_abstract_class;

public class PhoneExample {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.owner = "man1";

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
