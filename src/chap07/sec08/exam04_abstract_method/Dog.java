package chap07.sec08.exam04_abstract_method;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("멍 멍");
    }

    public Dog() {
        this.kind = "포유류";
    }
}
