package chap18.sec05.exam01;

import java.io.*;

public class Fi {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(new FileInputStream("C:\\Temp/file.txt"));

        int read = reader.read();
        System.out.println(read);

    }
}
