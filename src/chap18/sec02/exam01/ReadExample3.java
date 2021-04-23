package chap18.sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample3 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\Temp/test.txt");
            byte readBytes [] = new byte[3];
            int readNo;
//            System.out.println(is.read(readBytes));
//            readNo = is.read(readBytes);
//            System.out.println(readNo);
            while ((readNo = is.read(readBytes)) != -1){
                System.out.println(readNo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
