package chap08.sec04.exam01_abstract_method_use;

import chap08.sec03.exam01_name_implement_class.RemoteControl;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {

        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {

        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 TV volume : " + this.volume);

    }
}
