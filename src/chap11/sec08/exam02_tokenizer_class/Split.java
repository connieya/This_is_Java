package chap11.sec08.exam02_tokenizer_class;

public class Split {
    public static void main(String[] args) {
        String text = "홍길동 이수홍 박연수";

        String[] s = text.split(" ");
        for (String str : s){
            System.out.println(str);
        }
        System.out.println(s.length);

    }
}
