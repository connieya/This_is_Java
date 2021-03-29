package chap08.sec04.exam01_abstract_method_use;

import chap08.sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
    }
}
