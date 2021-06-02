package chap06.sec07.exam05;

public class Car1 {
    String model;
    String color;
    int maxSpeed;

    public Car1(String model) {
        this.model = model;
        this.color = "파란색";
        this.maxSpeed = 122;
    }

    public Car1(String model, String color) {
        this.model = model;
        this.color = color;
        this.maxSpeed = 100;
    }

    public Car1(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
