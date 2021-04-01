package chap11.sec07.exam02_String_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
    public static void main(String[] args) {
        String str = "안녕하세요";

        byte [] bytes1 = str.getBytes();
        System.out.println("bytes1.length : " +bytes1.length);
        System.out.println("bytes1 : " + bytes1);

        String str1 = new String(bytes1);
        System.out.println(" bytes1 -> String : " +str1);

        System.out.println();
        try {
            byte [] bytes2 = str.getBytes("EUC-KR");
            System.out.println("bytes2.length : " +bytes2.length);
            System.out.println("bytes2 : " +bytes2);
            String str2 = new String(bytes2,"EUC-KR");
            System.out.println("bytes2 -> String : " + str2);

            System.out.println();
            byte [] bytes3 = str.getBytes("UTF-8");
            System.out.println("bytes3.length : " + bytes3.length);
            System.out.println("bytes3 : " + bytes3);
            String  str3 = new String(bytes3 , "UTF-8");
            System.out.println(" bytes3 -> String : " + str3);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
