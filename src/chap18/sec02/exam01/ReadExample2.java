package chap18.sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\Temp/forest.jpg");
            int readByte;
            byte byteValue []= new byte[200];
            while (true){
                readByte = is.read(byteValue);
                if (readByte == -1) break;
                System.out.println(  readByte);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
