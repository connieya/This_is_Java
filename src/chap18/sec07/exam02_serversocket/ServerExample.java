package chap18.sec07.exam02_serversocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            // 서버를 개발하려면 ServerSocket 객체를 얻어야한다.
            serverSocket = new ServerSocket();
            //포트 바인딩을 위해 bind()메서드 호출
            serverSocket.bind(new InetSocketAddress("localhost",5001));
            // 포트 정보를 가진 InetSocketAddress
            while (true){
                System.out.println("[연결 기다림]");
                Socket socket = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 수락함] " +isa.getHostName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!serverSocket.isClosed()){
            try {
                serverSocket.close();
            } catch (Exception e) {

            }
        }
    }
}
