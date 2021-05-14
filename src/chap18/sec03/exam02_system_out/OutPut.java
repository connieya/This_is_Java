package chap18.sec03.exam02_system_out;

import java.io.Console;
import java.io.IOException;
import java.io.PrintStream;

public class OutPut {
    public static void main(String[] args) throws IOException {
//        PrintStream out = System.out;
//
//        String name = "박건희";
//        byte[] bytes = name.getBytes();
//        out.write(bytes);
//        out.flush();

        PrintStream os = System.out;
        String name = "홍길동";
        byte[] bytes = name.getBytes();
        System.out.write(bytes);

        Console console = System.console();


    }
}
