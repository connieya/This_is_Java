package chap07.sec04.exam01_overriding;

public class ComputerExample {

    public static void main(String[] args) {

        int r = 10;
//
//        Calculator calculator = new Calculator();
//        System.out.println("원 면적 : " + calculator.areaCircle(r));
//
//        Computer computer = new Computer();
//        System.out.println("원 면적 : " + computer.areaCircle(r));

//        Computer computer1 = (Computer) new Calculator();
//        System.out.println("원 면적 : " + computer1.areaCircle(r)  );

        Calculator calculator1 = new Computer();
        System.out.println("원 면적 : " + calculator1.areaCircle(r));
    }
}
