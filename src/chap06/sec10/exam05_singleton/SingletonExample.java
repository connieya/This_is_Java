package chap06.sec10.exam05_singleton;

public class SingletonExample {
    public static void main(String[] args) {
//
//        Singleton obj1 = new Singleton();
//        Singleton obj2 = new Singleton();


        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();

        if (obj1 == obj2){
            System.out.println("같은 Singleton 객체 입니다.");
        }else {
            System.out.println("다른 Singleton 객체 입니다.");
        }

    }
}
