package 정처기;

public class ForExam {

    public static void main(String[] args) {
        int s = 0;

        for (int i=0; i<10; i++){
            if (i%2 == 0){
                s += i;
            }
        }
        System.out.println(s);
    }
}
