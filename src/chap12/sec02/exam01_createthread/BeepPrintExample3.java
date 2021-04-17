package chap12.sec02.exam01_createthread;

import java.awt.*;

public class BeepPrintExample3 {
    // JVM 에 있는 메인 스레드가 실행한다.
    public static void main(String[] args) {
        //how1
//        Thread beepThread = new BeepThread();
//
//        beepThread.start();

        //how2 익명객체
        Thread thread = new Thread(){
            @Override
            public void run() {
                // 비프음 5번 반복해서 소리나게 하는 작업
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i= 0; i<5; i++){
                    toolkit.beep();

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();

        // 띵 문자열을 5번 출력하는 작업
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
