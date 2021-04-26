package chap06.sec07.exam05;

public class Car {

    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자
    Car(){

    }

    public Car(String model) {
//        this.model = model;
        this(model,"은색",250);
    }

    public Car(String model, String color) {
//        this.model = model;
//        this.color = color;
        this(model, color , 20);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
