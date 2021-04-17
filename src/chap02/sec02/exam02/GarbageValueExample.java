package chap02.sec02.exam02;

public class GarbageValueExample {
    public static void main(String[] args) {
        byte var1 = 125;
        int var2 = 125;

        for (int i=0; i<5; i++){
            var1++;
            var2++;
            System.out.println("var1 : " +var1 +"\t" +"var2 :" +var2);
        }

        byte value1 = -126;
        int value2 = -126;

        for (int j= 4; j>0; j--){
            value1--;
            value2--;

            System.out.println("value1 : " +value1 +"\t" +"value2 :" +value2);
        }
    }
}
