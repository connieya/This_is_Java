package 정처기;


import java.io.*;
import java.util.Stack;

public class MainTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count =0;
        int len = str.length();
        for (int i=0; i<len; i++){
            if (str.charAt(i)=='c' && i<len-1){
                if (str.charAt(i+1)=='='){
                    i++;
                }else if(str.charAt(i+1)=='-'){
                    count++;
                }
            }else if(str.charAt(i)=='d'){
                if (str.charAt(i+1)=='-'){
                    count++;
                }
            }
        }

    }
}
