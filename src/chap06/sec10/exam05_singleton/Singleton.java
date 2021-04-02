package chap06.sec10.exam05_singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    static Singleton getSingleton(){
        return singleton;
    }
}
