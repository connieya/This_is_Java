package chap06.sec10.exam03_static_block;

public class Television {
    static String company = "Samsung";
    static String model = "LCD";
    static String info;

    static {
        info = company +"-"+model;
    }
}
