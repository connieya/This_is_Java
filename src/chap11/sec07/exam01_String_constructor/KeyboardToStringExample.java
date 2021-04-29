package chap11.sec07.exam01_String_constructor;

import java.io.IOException;

public class KeyboardToStringExample {

    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];

        System.out.println("입력 :");
        int readByteNo = System.in.read(bytes);

        String str = new String(bytes , 0 , readByteNo-2);
        System.out.println(str);
    }
}
