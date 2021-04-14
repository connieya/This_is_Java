package chap18.sec04.exam03_fileoutputstream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws Exception {
        String originalFileName =
                "C:\\study\\ThisIsJava\\src\\chap18\\sec04\\exam03_fileoutputstream/banner.jpg";

        String targetFileName = "C:\\Temp/banner.jpg";

        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;

        byte[ ] readBytes = new byte[100];

        while ((readByteNo = fis.read(readBytes)) != -1 ){
            fos.write(readBytes , 0 ,readByteNo);
        }

        fos.flush();
        fos.close();
        fis.close();

        System.out.println("복사가 잘 되었습니다.");

    }
}
