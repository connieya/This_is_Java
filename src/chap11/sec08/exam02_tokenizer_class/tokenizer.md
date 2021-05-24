# StringTokenizer 클래스
문자열이 한 종류의 구분자로 연결되어 있을 경우, StringTokenizer 클래스를
사용하면 손쉽게 문자열(토큰:token)을 분리해 낼 수 있다.
StringTokenizer 객체를 생성할 때 첫 번째 매개값으로 전체 문자열을 주고,
두 번째 매개값으로 구분자를 주면 된다.

```java
StringTokenizer st = new StringTokenizer("문자열","구분자");
```

만약 구분자를 생략하면 공백(Space)이 기본 구분자가 된다. 예를 들어
문자열이 "/"로 구분되어 있을 경우, 다음과 같이 StringTokenizer 객체를
생성할 수 있다.
```java
String text = "홍길동/이수홍/박연수";
StringTokenizer st = new StringTokenizer(text,"/");
```
StringTokenizer 객체가 생성되면 부분 문자열을 분리해 낼 수 있는데,
다음 메소드들을 이용해서 전체 토큰 수 , 남아 있는 토큰 여부를 확인한 다음,
토큰을 읽으면 된다.

- int - countTokens() -  꺼내지 않고 남아 있는 토큰의 수
- boolean - hasMoreTokens() - 남아 있는 토큰이 있는지 여부
- String - nextToken() - 토큰을 하나씩 꺼내옴

nextToken () 메소드로 토큰을 하나 꺼내오면 StringTokenizer 객체에는
해당 토큰이 없어진다.
만약 StringTokenizer 객체에서 더 이상 가져올 토큰이 없다면
nextToken() 메소드는 java.util.NoSuchElementException 
예외를 발생시킨다. 그래서 nextToken() 메소드를 사용하기 전에 hasMoreToken()
메소드로 꺼내올 토큰이 있는지 조사한 후 nextToken() 메소드를 호출하는 것이
좋은 코딩 방법이다. 다음은 두가지 방법으로 토큰을 추출하는 방법을 보여준다.

`StringTokenizerExample.java` StringTokenizer로 토큰 분리하기

```java

public class StringTokenizerExample {
    public static void main(String[] args) {
        String text = "홍길동/이수홍/박연수";

        StringTokenizer st = new StringTokenizer(text, "/");
        int countTokens = st.countTokens();
        for (int i=0; i<countTokens; i++){
            String token = st.nextToken();
            System.out.println(token);
        }

        System.out.println();

        st = new StringTokenizer(text, "/");
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
```


split() 메소드 사용

```java

public class Split {
    public static void main(String[] args) {
        String text = "홍길동 이수홍 박연수";

        String[] s = text.split(" ");
        for (String str : s){
            System.out.println(str);
        }
        System.out.println(s.length);

    }
}

```