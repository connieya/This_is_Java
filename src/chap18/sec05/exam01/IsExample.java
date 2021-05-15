package chap18.sec05.exam01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class IsExample {

    public static void main(String[] args) throws IOException {
        Reader reader=  new InputStreamReader(System.in);

        int read = reader.read();
        System.out.println(read);
    }
}
