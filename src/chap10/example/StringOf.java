package chap10.example;

import java.nio.charset.StandardCharsets;

public class StringOf {

    public static void main(String[] args) {

        String exam = "AbCadssazS";
        char c = exam.charAt(0);
        char c1 = Character.toLowerCase(c);
        System.out.println("c1 = " + c1);
        boolean letter = Character.isLetter(c1);
        System.out.println("letter =  " +letter);
        boolean r1 = Character.isLowerCase(c);
        System.out.println("r1 = " +r1);
        boolean r2 = Character.isLowerCase(c1);
        System.out.println("r2 = " +r2);

        char[] chars = exam.toCharArray();
//        System.out.println("chars = " +chars);

        for (int i =0; i< chars.length; i++){
            System.out.println("result = " + chars[i]);
        }
    }
}
