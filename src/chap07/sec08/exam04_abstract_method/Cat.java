package chap07.sec08.exam04_abstract_method;

public class Cat extends Animal{

    public Cat() {
        this.kind ="포유류";
    }


    @Override
    public void sound() {
        System.out.println("냐옹~");
    }
}