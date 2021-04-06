package chap09.sec03.exam04_nesting_class_reference;

public class OutterExample {
    public static void main(String[] args) {
        Outter outter = new Outter();

        outter.method();

        Outter.Nested nested = outter.new Nested();
        nested.print();
    }
}
