package chap05.sec06.exam09_array_copy;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int [] oldArray = { 1, 2, 3};
        int [] newArray = new int[5];

        for (int i=0; i< oldArray.length; i++){
            newArray[i] = oldArray[i];
        }

        for (int i = 0; i< newArray.length; i++){

            System.out.print(newArray[i] + ",");
        }

        System.out.println();

        int [] newArray2 = new int[2];
        for (int i=0; i< oldArray.length; i++){
            newArray2[i] = oldArray[i];
        }
        // ArrayIndexOutOfBoundException 발생

        for (int i=-0; i< newArray2.length; i++ ){
            System.out.print(newArray2[i] + ", ");
        }

    }
}
