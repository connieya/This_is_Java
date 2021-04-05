package chap07.sec08.exam04_abstract_method;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
        System.out.println("------------------");

        //변수의 자동 타입 변환
        Animal animal;
        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
        System.out.println("------------------------------");


        //메소드의 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }

    private static void animalSound(Animal animal) {
            animal.sound();
    }
}
