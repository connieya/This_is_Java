# String 생성자

자바의 문자열은 java.lang 패키지의 String 클래스의 인스턴스로 관리된다. 소스상에서 문자열
리터럴은 String 객체로 자동 생성 되지만, String 클래스의 다양한 생성자를 이용해서 직접
String 객체를 생성할 수도 있다. String 클래스는 Deprecated(비권장)된 생성자를
제외하고 약 13개의 생성자를 제공한다. Deprecated는 예전 자바 버전에서는 사용되었으나,
현재 버전과 차후 버전에서는 사용하지 말라는 뜻이다. 어떤 생성자를 이용해서 String 객체를
생성할지는 제공되는 매개값의 타입에 달려있다. 다음은 사용 빈도수가 높은 생성자들이다.

파일의 내용을 읽거나, 네트워크를 통해 받은 데이터는 보통 byte[] 배열이므로 
이것을 문자열로 변환하기 위해 사용된다. 

```java
//배열 전체를 String 객체로 생성
String str = new String(byte[] bytes);
//지정한 문자셋으로 디코딩
String str = new String(byte[] bytes, String charsetName);

//배열의 offset 인덱스 위치부터 length 만큼 String 객체로 생성
String str = new String(byte[] bytes, int offset , int length);
//지정한 문자셋으로 디코딩
String str = new String(byte[] bytes , int offset , int length , String charsetName)
```

다음은 바이트 배열을 문자열로 변환하는 예제이다.

```java
public class ByteToStringExample {
    public static void main(String[] args) {
        byte[] bytes = {72,101,108,108,111,32,74,97,118,97};

        String str1 = new String(bytes);
        System.out.println(str1);

        String str2 = new String(bytes,6,4);
        System.out.println(str2);


    }
}
출력결과 :
Hello Java
Java
```
다음 예제는 키보드로부터 읽은 바이트 배열을 문자열로 변환하는 방법을 보여준다.
System.in.read() 메소드는 키보드에서 입력한 내용을 매개값으로 주어진 바이트 배열에
저장하고 읽은 바이트 수를 리턴한다. 예를 들어 Hello 를 입력하고 엔터키를 눌렀다면

Hello + 캐리지리턴(\r)+라인피드(\n)의 코드값이 바이트 배열에 저장되고 총 7개의
바이트를 읽었기 때문에 7을 리턴한다.

입력 내용 : H e l l o \r \n

바이트 배열 내용 : 72 101 108 108 111 13 10   (13,10 은 엔터키이다.)

영어는 알파벳 한 자가 1바이트로 표현되지만, 한글과 기타 다른 나라 언어는 2바이트로
표현되기 때문에 입력된 문자 수와 읽은 바이트 수가 다를 수 있다. 바이트 배열을 
문자열로 변환하기 위해 String(byte[] bytes ,int offset , int length)를 사용
하였는데, length 매개값으로 배열 길이에서 2를 빼준 이유는 
캐리지리턴(\r) + 라인피드(\n) 부분은 문자열로 만들 필요가 없기 때문이다

```java
public class KeyboardToStringExample {

    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];

        System.out.println("입력 :");
        int readByteNo = System.in.read(bytes);

        String str = new String(bytes , 0 , readByteNo-2);
        System.out.println(str);
    }
}

```