package chap18.sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample5 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\Temp/test2.txt");
            byte byteValue[] = new byte[6];
//            System.out.println(is.read(byteValue));
            String data = new String(byteValue, 0,is.read(byteValue));
            System.out.println(data);

            String examData = "aesdqdsadadsadq";
            byte byteEx[] = new byte[3];

            String writeData = new String(byteEx,0,3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
