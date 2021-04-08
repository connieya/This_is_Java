package chap11.sec13.exam02_random_class;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // 선택 번호
        int [] selectNumber = new int[6];

        Random random = new Random(3);
        System.out.println("선택 번호 :");
        for (int i=0; i<selectNumber.length; i++){
            selectNumber[i] = random.nextInt(45)+1;
            System.out.print(selectNumber[i] +" ");
        }
        System.out.println();

        //당첨 번호
        int [] winnigNumber = new int[6];
        random = new Random(3);
        System.out.println("당첨 번호 :");
        for (int i=0; i< winnigNumber.length; i++){
            winnigNumber[i] = random.nextInt(45) + 1;
            System.out.print(winnigNumber[i] + " ");
        }
        System.out.println();

        //당첨 여부
        Arrays.sort(selectNumber);
        Arrays.sort(winnigNumber);
        boolean result = Arrays.equals(selectNumber,winnigNumber);
        if (result){
            System.out.println("1등에 당첨 되었습니다.");
        }else {
            System.out.println("당첨 되지 않았습니다.");
        }
    }

}
