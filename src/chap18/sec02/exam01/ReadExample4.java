package chap18.sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample4 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\Temp/test.txt");
            int readByteNo;
            byte[] readBytes = new byte[3];
            String data = "";
            while ((readByteNo = is.read(readBytes)) != -1) {
                data = new String(readBytes, 0, readByteNo);
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
