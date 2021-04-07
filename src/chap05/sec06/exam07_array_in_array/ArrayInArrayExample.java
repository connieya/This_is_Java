package chap05.sec06.exam07_array_in_array;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int [][] javaScores = { {95,80}, {92,96,80}};
        System.out.println(javaScores[0]);
        System.out.println(javaScores[0].length);
        System.out.println(javaScores[1].length);
        for (int i=0; i< javaScores.length; i++){
            for (int j=0; j< javaScores[i].length; j++){
                System.out.println(javaScores[i][j]);
            }
        }

        System.out.println();

        int [][] arrays = { {100,91, 97} , {312,22,33,123,1233,221,33} ,{1233,2231,331,3} , {12},{231}};
        for (int i =0 ; i<arrays.length; i++){
            for (int j=0; j<arrays[i].length; j++){
                System.out.println(arrays[i][j]);
            }
        }
    }
}
