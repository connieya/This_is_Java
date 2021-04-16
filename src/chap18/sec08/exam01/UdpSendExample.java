package chap18.sec08.exam01;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSendExample {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();


        System.out.println("[발신 시작]");

        for (int i = 1; i < 3; i++) {
            String data = "메시지 " + i;
            byte[] byteArr = data.getBytes("UTF-8");
            DatagramPacket packet = new DatagramPacket(
                    byteArr, byteArr.length, new InetSocketAddress("localhost", 5001)
            );

            // 수신자에게 데이터 전달
            datagramSocket.send(packet);
            System.out.println("[보낸 데이터 수]: " + byteArr.length + "bytes");
        }

        System.out.println("[발신 종료]");

        datagramSocket.close();
    }
}
