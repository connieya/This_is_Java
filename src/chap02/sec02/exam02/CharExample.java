package chap02.sec02.exam02;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A'; //문자를 직접 저장
        char c2 = 65; // 10진수로 저장
        char c3 = '\u0041'; // 16진수로 저장

        char c4 = '가'; // 문자를 직접 저장
        char c5 = 44032; // 10진수로 저장
        char c6 = '\uac00'; // 16진루소 저장


        int uniCode = c1;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(uniCode);

        int uni = '각';
        System.out.println(uni);

        char char1 = '건';

        int uni2 = char1;
        System.out.println(uni2);

        int uni3 = 'B';

        System.out.println(uni3);

        char char2 = ' ';
        System.out.println("char2 : " +char2);

        int uni4 = char2;

        System.out.println("uni4 : " +uni4);
    }

}

