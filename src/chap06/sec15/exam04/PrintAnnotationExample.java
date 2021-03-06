package chap06.sec15.exam04;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) {

        //Service 클래스로부터 메소드 정보를 얻음
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        //Method 객체를 하나씩 처리
        for (Method method : declaredMethods) {

            //PrintAnnotation 이 적용 되었는지 확인
            if (method.isAnnotationPresent(PrintAnnotation.class)) {

                //PrintAnnotation 객체 얻기
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                // 메소드 이름 출력
                System.out.println("[" +method.getName()+ "]");

                // 구분선 출력
                for (int i=0; i< printAnnotation.number(); i++){
                    System.out.print(printAnnotation.value());
                }
                System.out.println();

                try {
                    method.invoke(new Service());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
        }
    }
}
