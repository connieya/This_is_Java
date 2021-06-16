package chap14.sec03.exam03_return;


public class MyFunctionalInterfaceExample {

    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x,y) -> {
            int result = x+y;
            System.out.println(result);
            return 0;
        };

        fi.method(4,5);

        fi = (x,y) -> { return x+y;};


        fi = (x,y) -> x+y;
        System.out.println(fi.method(12,32));

        fi = (x,y) -> sum(x,y);
        System.out.println(fi.method(2,5));
    }
    public static int sum(int x,int y){
        return x+y;
    }

}
