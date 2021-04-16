package chap18.sec08.exam02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiveExample extends Thread {

    public static void main(String[] args) throws SocketException, InterruptedException {
        // 수신자로 사용할 DatagramSocket 객체 , 바인딩할 포트 번호를 매개값으로 지정하고 생성
        DatagramSocket datagramSocket = new DatagramSocket(5001);

        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("[수신 시작]");
                try {
                    while (true){
                        // 패킷의 내용을 저장
                        DatagramPacket packet = new DatagramPacket(new byte[100],100);
                        // receive 메소드를 호출해서 패킷을 읽을 준비를 함
                        datagramSocket.receive(packet);

                        String data = new String(packet.getData(), 0 , packet.getLength(), "UTF-8");
                        System.out.println("[받은 내용 : " + packet.getSocketAddress()+"]"+data);
                    }
                } catch (Exception e) {
                    System.out.println("[수신 종료]");
                }
            }
        };
        thread.start();

        Thread.sleep(10000);
        datagramSocket.close();
    }
}
