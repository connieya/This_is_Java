package chap15.sec04.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class FileReaderEx {
    public static void main(String[] args) {
       String path = FileReaderEx.class.getResource("exam.txt").getPath();

        try {
            FileReader fileReader = new FileReader(path);
            int read;
            while (( read =fileReader.read() )== -1){
                System.out.print(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
