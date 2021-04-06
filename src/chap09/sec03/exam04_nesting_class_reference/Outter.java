package chap09.sec03.exam04_nesting_class_reference;

public class Outter {
    String field = "Outer-field";

    void method(){
        System.out.println("Outter-method");
    }

    class Nested {
        String field = "Nested-field";
        void method(){
            System.out.println("Nested-method");
        }

        void print(){
            System.out.println(this.field);
            this.method();
            System.out.println(Outter.this.field);
            Outter.this.method();
        }
    }

}
