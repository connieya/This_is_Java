package chap06.sec08.exam04_method_overloading;

public class CalculatorExample {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        double result1 =c1.areaRectangle(10);

        System.out.println("정사각형의 넓이 : " +result1);


        Calculator c2 = new Calculator();
         result1 = c2.areaRectangle(10,12);
        System.out.println("직사각형의 넓이 : " + result1);
    }
}
