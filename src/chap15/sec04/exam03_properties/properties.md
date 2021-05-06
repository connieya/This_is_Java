# Properties

Properties는 Hashtable의 하위 클래스이기 때문에 Hashtable의 모든
특징을  그대로 가지고 있다. 차이점은 Hashtable은 키와 값을 다양한
타입으로 지정이 가능한데 비해 Properties는 키와 값을 String 타입으로
제한한 컬렉션이다. Propterties는 애플리케이션의 옵션 정보, 데이터베이스 연결
정보 그리고 국제화(다국어) 정보가 저장된 프로퍼티(~.properties) 파일을
읽을 때 주로 사용한다.

프로퍼티 파일은 키와 값이 = 기호로 연결되어 있는 텍스트 파일로 ISO 8859-1
문자셋으로 저장된다. 이 문자셋으로 직접 표현할 수 없는 한글은 유니코드(Unicode)
로 변환되어 저장된다. 예를 들어 다음과 같이 contry와 language 키로
각각 "대한민국" , "한글"을 입력하면 자동으로 유니코드로 변환되어 저장된다.
이클립스에서 유니코드로 변환된 내용을 다시 한글로 보려면 마우스를 유니코드
위에 올려 놓으면 된다.


```properties
contry = 대한민국  -> contry = \uB300\uD55C\uBBFC\uAD6D
language = 한글 -> language = \uD55C\uAE00
```

이클립스를 사용하지 않는다면, 한글이 포함된 프로퍼티 파일을 다른 에디터에서
작성하고 <JDK 설치폴더>\bin\native2ascii.exe 툴을 이용해서
ISO 8859_1 파일을 얻으면 된다.

```properties
native2ascii.exe 원본.properties 변경.properties
```

다음은 데이터베이스 연결 정보가 있는 프로퍼티 파일의 내용을 보여준다.
driver , url , username, password는 키가 되고 그 뒤의 문자열은
값이 된다.

`database.properties` 키=값으로 구성된 프로퍼티

```properties
driver = oracle.jdbc.OracleDriver
url = jdbc.oracle:thin:@localhost:1521:orcl
username = scott
password = tiger
```


프로퍼티 파일을 읽기 위해서는 Properties 객체를 생성하고, load() 
메소드를 호출하면 된다. load() 메소드는 프로퍼티 파일로부터 데이터를
읽기 위해 FileReader 객체를 매개값으로 받는다.

```java
Properties properties = new Properties();
properties.load(new FileReader("C:/~/database.properties"));
```

`PropertiesEx.java`  프로퍼티 파일로부터 데이터 읽기

```java

public class PropertiesEx {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties
                    .load(new FileReader
                            ("C:\\study\\ThisIsJava\\src\\chap15\\sec04\\exam03_properties/database.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver = " +driver);
        System.out.println("url  = " +url);
        System.out.println("username = " +username);
        System.out.println("password = " +password);

    }
}
```


프로퍼티 파일은 일반적으로 클래스 파일(.~class)과 함께 저장된다.
클래스 파일을 기준으로 상대 경로를 이용해서 프로퍼티 파일의 경로를 얻으려면
Class외 getResource() 메소드를 이용하면 된다.

getResource()는 주어진 파일의 상대 경로를 URL 객체로 리턴하는데,
URL의 getPath()는 파일의 절대 경로를 리턴한다. 다음은 클래스 파일과
동일한 위치에 있는 "database.properties" 파일을 읽고 
Properties 객체를 생성하는 코드이다.

```java
String path = 클래스.class.getResourcee("database.properties").getPath();
path = URLDecoder.decode(path , "utf-8");  <-- 경로에 한글이 있을 경우 한글을 복원
Properties properties = new Properties();
properties.load(new FileReader(path));
```

만약 다른 패키지에 프로퍼티 파일이 있을 경우에는 경로 구분자로 
"/"를 사용한다. 예를 들어 A.class가 com.mycompany 패키지에 있고,
database.properties 파일이 com.mycompany.config 패키지에 있을 경우
프로퍼티 파일의 절대 경로는 다음과 같이 얻을 수 있다.

```java
String path = A.class.getResource("config/database.properties").getPath();
```

Properties 객체에서 해당 키의 값을 읽으려면 getProperty() 메소드를 사용한다.
물론 Properties도 Map 컬렉션 이므로 get() 메소드로 값을 얻을 수 있다.
그러나 get() 메소드는 값을 Object 타입으로 리턴하므로 강제 타입 변환해서
String을 얻어야 하기 때문에 일반적으로 getProperty() 메소드를 사용한다.

```java
String  driver1 = (String) properties.get("driver");
String driver = properties.getProperty("driver");
```

다음은 database.properties 파일로부터 값을 읽어 출력하는 예제이다.

`PropertiesExample.java` 프로퍼티 파일로부터 읽기

```java

public class PropertiesExample {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = PropertiesExample.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path,"utf-8");
        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " +driver );
        System.out.println("url : " +url );
        System.out.println("username : " +username );
        System.out.println("password : " +password );

        //다른 패키지에 있을 경우 파일 읽는 방법
        path = PropertiesExample.class.getResource("/chap15/sec04/example/database.properties").getPath();
        properties.load(new FileReader(path));


        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");

        System.out.println("driver : " +driver );
        System.out.println("url : " +url );
        System.out.println("username : " +username );
        System.out.println("password : " +password );
    }
}
```