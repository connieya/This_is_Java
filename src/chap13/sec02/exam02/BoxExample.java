package chap13.sec02.exam02;


public class BoxExample {
    public static void main(String[] args) {
        Box<String > box1 = new Box<>();
        box1.set("hello");
        String str = box1.get();
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.set(6);
        Integer value = box2.get();
        System.out.println(value);
    }
}
