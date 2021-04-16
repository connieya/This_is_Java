package chap18.sec07.exam03_socket;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket();
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost",5001));
            System.out.println("[연결 성공]");
        }catch (Exception e){

        }
        if (!socket.isClosed()){
            try {
                socket.close();
            } catch (Exception e) {

            }
        }
    }
}