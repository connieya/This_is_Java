package chap18.sec04.exam04_file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(
                "C:\\study\\ThisIsJava\\src\\chap18\\sec04\\exam04_file_reader/FileReaderExample.java"
        );

        int readCharNo;
        char[] cbuf = new char[100];
        while ((readCharNo = fr.read(cbuf)) != -1){
            String data = new String(cbuf,0,readCharNo);
            System.out.println(data);
        }
        fr.close();
    }
}
