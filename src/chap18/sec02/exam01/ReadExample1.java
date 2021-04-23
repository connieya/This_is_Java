package chap18.sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\Temp/test.txt");
            System.out.println(is.read());
            int readByte;
            while ((readByte = is.read()) != -1){
                System.out.println( (char) readByte);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
