package chap18.sec04.exam02_fileinputstream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(
                "C:\\study\\ThisIsJava\\src\\chap18\\sec04\\exam02_fileinputstream/FileInputStreamExample.java"
        );

        int data;
        while ((data = fis.read() )  != -1){
            System.out.write(data);
        }
        fis.close();

    }
}
