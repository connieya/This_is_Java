# null 과 NullPointerException

참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null(널)값을
가질 수 있다. null 값도 초기값으로 사용할 수 있기 때문에 null로 초기화
된 참조 변수는 스택 영역에 생성된다.

참조 타입 변수가 null 값을 가지는지 확인하려면 다음과 같이 == , != 
연산을 수행하면 된다. 

자바는 프로그램 실행 도중에 발생하는 오류를 예외라고 부른다.
예외는 사용자의 잘못된 입력으로 발생할 수도 있고, 프로그래머가
코드를 잘못 작성해서 발생할 수도 있다. 참조 변수를 사용하면서
가장 많이 발생하는 예외 중 하나로 NullPointerException이 있다.
이 예외는 참조 타입 변수를 잘 못 사용하면 발생한다.
참조 타입 변수가 null을 가지고 있을 경우, 참조 타입 변수는 사용할 수 없다.
참조 타입 변수를 사용하는 것은 곧 객첼르 사용하는 것을 의미하는데,
참조할 객체가 없으므로 사용할 수가 없는 것이다. 그러나 프로그래머의
실수로 null 값을  가지고 있는 참조 타입 변수를 사용하면
NullPointerException이 발생한다. 

```java
int [] intArray = null;
intArray[0] = 10; // NullPointerException
```

상기 코드에서 intArray는 배열 타입 변수이므로 참조 타입 변수이다.
그래서 null로 초기화가 가능하다. 이 상태에서 intArray[0]에
10을 저장하려고 하면 NullPointerException이 발생한다. 
이유는 intArray 변수가 참조하는 배열 객체가 없기 때문이다.

다른 코드를 살펴보자

```java
String str = null;
System.out.println("총 문자수 : " +str.legnth()); // NullPointerException
```

String은 클래스 타입이므로 참조 타입이다.
따라서 str 변수도 null 초기화가 가능하다. 이 상태에서 String 객체의
length()라는 메소드를 호출하면 NullPointerException이 발생한다.
이유는 str 변수가 참조하는 String 객체가 없기 때문이다. 
프로그램 실행 도중 NullPointerException이 발생하면, 예외가 발생된 곳에서
객체를 참조하지 않은 상태로 참조 타입 변수를 사용하고 있음을 알아야 한다.
대처 방법은 이 변수를 추적해서 객체를 참조하도록 수정해야 한다.
NullPointerException은 아마 여러분이 앞으로 가장 많이 볼 수 있는
예외 중 하나일 것이다.