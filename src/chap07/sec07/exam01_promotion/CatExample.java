package chap07.sec07.exam01_promotion;

public class CatExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = cat;

        System.out.println(cat == animal);
    }
}
