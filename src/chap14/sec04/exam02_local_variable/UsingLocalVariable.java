package chap14.sec04.exam02_local_variable;

public class UsingLocalVariable {
    void method(int arg){  //arg는 final 특성을 가짐
        int localVar = 40; // localVar는 final 특성을 가짐

//        arg = 31;  // final 특성 때문에 수정 불가
//        localVar = 41; // final 특성 때문에 수정 불가

        MyFunctionalInterface fi = () ->{
            //로컬 변수 읽기
            System.out.println("arg :"+arg);
            System.out.println("lovalVar :"+localVar+"\n");
        };
        fi.method();
    }
}
