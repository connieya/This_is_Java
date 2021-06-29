package 정처기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class Person{
        int weight, height;
        public Person(int weight,int height){
            this.weight = weight;
            this.height = height;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Person[] person = new Person[N];
        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            person[i] = new Person(weight,height);
        }
        for (int i=0; i<N; i++){
            int count =0;
            for (int j=0; j<N; j++){
                if ((person[j].height>person[i].height) && (person[j].weight> person[i].weight)){
                    count++;
                }
            }
            System.out.print(++count+" ");
        }

    }

}