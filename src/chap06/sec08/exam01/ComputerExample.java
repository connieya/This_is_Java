package chap06.sec08.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int[] values1 = {10,21,32};
        int result1 = myCom.sum1(values1);

        System.out.println("result1 : " + result1);

        int result2 = myCom.sum1(new int[] {2,1,5,21,9});
        System.out.println("result2 : " +result2);

        int result3 = myCom.sum2(1,33,2,3);
        System.out.println("result3 : " +result3);


    }


}
