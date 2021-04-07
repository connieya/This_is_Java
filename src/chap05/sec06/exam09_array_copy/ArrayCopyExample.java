package chap05.sec06.exam09_array_copy;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ",");
        }

        System.out.println();
        String[] oldStrArray2 = {"알고리즘", "이것이자바다", "자료구조", "객체지향", "API공부", "SpringBoot", "JPA", "네카라쿠배"};
        String[] newStrArray2 = new String[7];

        System.arraycopy(oldStrArray2, 2, newStrArray2, 2, 4);

        for (int i=0; i< newStrArray2.length; i++){
            System.out.print(newStrArray2[i] +",");
        }

    }
}
