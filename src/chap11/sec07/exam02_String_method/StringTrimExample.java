package chap11.sec07.exam02_String_method;

public class StringTrimExample {

    public static void main(String[] args) {
        String tel1 = " 02";
        String tel2 = "123  ";
        String tel3 = "   1234";

        String telS = tel1+tel2+tel3;
        System.out.println(telS);

        String telS2 = tel1.trim()+ tel2.trim() + tel3.trim();
        System.out.println(telS2);
    }
}
