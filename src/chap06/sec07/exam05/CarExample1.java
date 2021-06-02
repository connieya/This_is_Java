package chap06.sec07.exam05;

public class CarExample1 {
    public static void main(String[] args) {
        Car1 c1 = new Car1("람보르기니");
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.maxSpeed);

        Car1 c2 = new Car1("포르쉐", "빨강");
        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.maxSpeed);
    }
}
