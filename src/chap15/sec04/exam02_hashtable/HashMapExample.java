package chap15.sec04.exam02_hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String ,String > map = new HashMap<>();

        map.put("spring","12");
        map.put("summer","1234");
        map.put("fall","ddd");
        map.put("winter","12345");


        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("아이디와 비밀번호를 입력해주세요");
            System.out.print("아이디 : ");
            String id = sc.next();

            System.out.print("비밀번호: ");
            String password = sc.next();
            System.out.println();


            if (map.containsKey(id)){
                if (map.get(id).equals(password)){
                    System.out.println("로그인 되었습니다.");
                    break;
                }else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }

            }else {
                System.out.println("입력하신 아이디가 존재 하지 않습니다.");
            }
        }
    }
}
