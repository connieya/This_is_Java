package chap12.sec02.exam01_createthread;

import java.awt.*;

//Thread의 하위 클래스로서 스레드 생성
public class BeepThread extends Thread {
    @Override
    public void run() {
        // 비프음 5번 반복해서 소리나게 하는 작업
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
