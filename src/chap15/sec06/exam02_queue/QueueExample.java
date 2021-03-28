package chap15.sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<Message>();

        messageQueue.offer(new Message("sendMail","홍길동"));
        messageQueue.offer(new Message("sendSMS","신용권"));
        messageQueue.offer(new Message("sendKakaoTalk","홍두께"));

        while (!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to+"님께 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to+"님께 SMS를 보냅니다.");
                    break;
                case "sendKakaoTalk":
                    System.out.println(message.to+"님께 카톡을 보냅니다.");
                    break;

            }
        }
    }
}
