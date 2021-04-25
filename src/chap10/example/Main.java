package chap10.example;

import java.util.Scanner;

class Main {

    public int solution(String input1 , char input2) {

        String s = input1.toUpperCase();
        char c = Character.toUpperCase(input2);
        int count = 0;
        for (int i =0; i < s.length(); i++){

            if (s.charAt(i) == c){
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);


        Main T = new Main();
        System.out.println(T.solution(input1 , input2));

    }

}