package chap08.sec04.exam01_abstract_method_use;

import chap08.sec03.exam01_name_implement_class.RemoteControl;

public class Television implements chap08.sec03.exam01_name_implement_class.RemoteControl {

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
        if (volume > chap08.sec03.exam01_name_implement_class.RemoteControl.MAX_VOLUME){
            this.volume = chap08.sec03.exam01_name_implement_class.RemoteControl.MAX_VOLUME;
        }else if(volume < chap08.sec03.exam01_name_implement_class.RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 TV volume : " + this.volume);

    }
}
