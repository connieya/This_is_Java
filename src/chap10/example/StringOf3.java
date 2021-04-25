package chap10.example;

public class StringOf3 {
    public static void main(String[] args) {
       String exam = "";
        System.out.println(exam);

       for (int i = 65; i<= 90; i++){
           exam += (char)i;
       }
        System.out.println(exam);
    }
}
