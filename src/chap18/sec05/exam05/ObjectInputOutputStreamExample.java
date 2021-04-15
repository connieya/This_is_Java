package chap18.sec05.exam05;

import java.io.*;

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");

        //객체를 직렬화하는 역할
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // 객체를 직렬화 하기 위해 writeObject() 메서드 사용
        oos.writeObject(new Integer(10));
        oos.writeObject(new Double(3.14));
        oos.writeObject(new int[] {1,2,3});
        oos.writeObject(new String("홍길동"));

        oos.flush(); oos.close(); fos.close();

        FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
        // 바이트 출력 스트림과 연결되어 객체를 직렬화하는 역할을 한다.
        ObjectInputStream ois = new ObjectInputStream(fis);

        // readObject() 메소드는 입력 스트림에서 읽은 바이트를 역직렬화해서 객체를 생성한다.
        Integer obj1 =  (Integer) ois.readObject();
        Double obj2 = (Double) ois.readObject();
        int [] obj3 = (int[]) ois.readObject();
        String obj4 = (String) ois.readObject();

        ois.close(); fis.close();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3[0]+","+obj3[1]+"," +obj3[2]);
        System.out.println(obj4);
    }
}
