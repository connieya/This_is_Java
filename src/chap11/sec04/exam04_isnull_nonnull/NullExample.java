package chap11.sec04.exam04_isnull_nonnull;

import java.util.Objects;

public class NullExample {

    public static void main(String[] args) {

        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.requireNonNull(str1));

        try {
            String name = Objects.requireNonNull(str2);
            System.out.println("str2 : " + name);
        } catch (Exception e) {
            System.out.println("e.getMessage() : " + e.getMessage());
        }

        try {
            String name = Objects.requireNonNull(str2, "이름이 없습니다.");
        } catch (Exception e) {
            System.out.println("e.getMessage() :  "+e.getMessage());
        }

        try {
            String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요.");  // 람다식
        } catch (Exception e) {
            System.out.println("e.getMessage() :  "+e.getMessage());
        }


    }
}
