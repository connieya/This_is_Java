# final 필드

final의 의미는 최종적이란 뜻을 가지고 있다. 그렇다면 final 필드는 최종적인 필드란 뜻인데,
무슨 말일까? final 필드는 초기값이 저장되면 이것이 __*최종적인 값이 되어서 프로그램 실행
도중에 수정 할 수 없다는 것이다.*__ final 필드는 다음과 같이 선언한다.

```java
final 타입 필드 = 초기값;
```

final 필드의 초기값을 줄 수 있는 방법은 딱 두가지 밖에 없다. 첫 번째는 필드 선언 시에 주는
방법이고, 두 번째는 생성자에서 주는 방법이다. 단순 값이라면 필드 선언 시에 주는 것이
제일 간단하다. 하지만 복잡한 초기화 코드가 필요하거나 객체 생성 시에 외부 데이터로 
초기화해야 한다면 생성자에서 초기값을 지정해야 한다. 생성자는 final 필드의 최종 초기화를
마쳐야 하는데, 만약 초기화되지 않은 final 필드를 그대로 남겨두면 컴파일 에러가 발생한다.

다음 예제를 보자. 주민등록번호 필드는 한 번 값이 저장되면 변경할 수 없도록 final 필드로
선언했다. 하지만 주민등록번호는 Person 객체가 생성될 때 부여되므로 Person 클래스 설계 시
초기값을 미리 줄 수 없다. 그래서 생성자 매개값으로 주민등록번호를 받아서 초기값으로 
지정해주었다. 반면 nation은 항상 고정된 값을 갖기 때문에 필드 선언시 초기 갑으로 
"Korea"를 주었다.

`Person.java`

```java
public class Person {
    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}

```

`PersonExample.java`  final 필드 테스트


```java
public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567","계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

//        p1.nation = "USA";
//        p1.ssn = "123422-31321";
        p1.name = "을지 문덕";
        System.out.println(p1.name);
    }
}

```

