package 정처기;

public class Expect06 {
    public static void main(String[] args) {
        for (int m = 0; m< 10; m++){
            if (m % 2 ==0)
                continue;
            System.out.print(m);
        }
    }
}
