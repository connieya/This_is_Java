package chap08.sec03.exam02_noname_implement_class;

public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {

            private int volume;

            @Override
            public void turnOn() {
                System.out.println("TV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("TV를 끕니다.");
            }

            @Override
            public void setVolume(int volume) {


            }
        };
    }
}
