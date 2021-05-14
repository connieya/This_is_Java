# System.out 필드

콘솔에서 입력된 데이터를 System.in으로 읽었다면, 반대로 콘솔로 데이터를
출력하기 위해서는 System 클래스의 out 정적 필드를 사용한다.
out은 PrintStream 타입의 필드이다. PrintStream은 OutputStream의
하위 클래스이므로 out 필드를 OutputStream 타입으로 변환해서 사용할 수 있다.

```java
OutputStream os = System.out;
```

콘솔로 1개의 바이트를 출력하려면 OutputStream의 write(int b) 메소드를
이용하면 된다.

이때 바이트 값은 아스키 코드인데, write() 메소드는 아스키 코드를
문자로 콘솔에 출력한다. 예를 들어 아스키 코드 97번을 write(int b)메소드로
출력하면 'a'가 출력된다.

```java
byte b = 97;
os.write(b);
os.flush();
```

OutputStream의 write(int b) 메소드는 1바이트만 보낼 수 있기 때문에
1바이트로 표현 가능한 숫자. 영어, 특스문자는 출력이 가능하지만,
2바이트로 표현되는 한글은 출력할 수 없다.
한글을 출력하기 위해서는 우선 한글을 바이트 배열로 얻은 다음,
write(byte[] b) 나 write(byte[]b , int off , int len) 메소드로
콘솔에 출력하면 된다.

```java
String name = "홍길동";
byte [] nameBytes = name.getBytes();
os.write(nameBytes);
os.flush();
```

다음은 write(int b) 메소드를 사용해서 연속된 숫자, 영어를 출력하고
write(byte[] b) 메소드를 사용해서 한글을 출력한 예지이다.

`SystemOutExample.java` 연속된 숫자, 영어, 한글 출력
```java

public class SystemOutExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        for (byte b = 48; b<58; b++){
            os.write(b);
        }
        os.write(10);

        for (byte b=97; b<123; b++){
            os.write(b);
        }
        os.write(10);

        String hangul ="가나다라마바사아자차카타파하";
        byte[] hangulBytes = hangul.getBytes();
        os.write(hangulBytes);

        os.flush();
    }
}
```

System 클래스의 out 필드를 OutputStream 타입으로 변환해서
콘솔에 출력하는 작업은 그리 편하지 않다. out은 원래
PrintStream 타입의 필드이므로 PrintStream의 print() 또는 println()
메소드를 사용하면 좀 더 쉬운 방법으로 다양한 타입의 데이터를 콘솔에
출력할 수 있다.

```java
PrintStream ps = System.out;
ps.println(...);

=> System.out.println(...);
```

우리는 지금까지 이 방법으로 콘솔에 데이터를 출력해왔다. 
PrintStream에 대해서는 보조 스트림에서 자세한 설명이 나온다.