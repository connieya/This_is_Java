package chap11.sec07.exam02_String_method;

public class StringReplaceExample {

    public static void main(String[] args) {
        String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
        String newStr =  oldStr.replace("자바","스프링부트 레거시");


        System.out.println(oldStr);
        System.out.println(newStr );
    }
}
