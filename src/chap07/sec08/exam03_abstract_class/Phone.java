package chap07.sec08.exam03_abstract_class;

public class Phone {

    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public Phone() {

    }

    public void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }

    public void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}
