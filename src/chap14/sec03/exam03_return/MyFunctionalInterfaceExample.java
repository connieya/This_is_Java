package chap14.sec03.exam03_return;


public class MyFunctionalInterfaceExample {

    public static void main(String[] args) {
        MyFunctionalInterface fi;

     fi = (x,y) -> {
         int result = x+y;
         System.out.println(result);
     };

     fi.method(4,5);
    }
}
