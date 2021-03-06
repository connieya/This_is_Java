package chap19.sec04.exam02_file_copy;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class FilesCopyMethodExample {

    public static void main(String[] args) throws IOException {

        Path from = Paths.get("src/chap19/sec04/exam02_file_copy/profile1.jpg");
        Path to = Paths.get("src/chap19/sec04/exam02_file_copy/profile2.jpg");

        Files.copy(from , to , StandardCopyOption.REPLACE_EXISTING);

        System.out.println("파일 복사 성공");

    }
}
