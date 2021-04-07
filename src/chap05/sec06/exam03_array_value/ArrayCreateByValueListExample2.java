package chap05.sec06.exam03_array_value;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int [] scores ;
//        scores = {5,4,2};
        scores = new int[] {83,90,87};
        int sum1 = 0;
        for (int i=0; i< scores.length; i++){
            sum1 += scores[i];
        }

        System.out.println("총합 : " +sum1);

        int sum2 = add(new int[] {83,90,87});
        System.out.println("총합 : " + sum2);
        System.out.println();
    }

    public static int add(int[] ints) {
        int sum = 0;
        for (int i=0; i< ints.length; i++){
            sum += ints[i];
        }
        return sum;
    }
}
