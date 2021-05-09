# ArrayList

ArrayList는 List 인터페이스의 구현 클래스로, 
ArrayList에 객체를 추가하면 객체가 인덱스로 관리된다.
일반 배열과 ArrayList는 인덱스로 객체를 관리한다는 점에서는 유사하지만,
큰 차이점을 가지고 있다. 배열은 생성할 때 크기가 고정되고
사용 중에 크기를 변경할 수 없지만, ArrayList는 저장 용량을 초과한
객체들이 들어오면 자동적으로 저장 용량(capacity)이 늘어난다는 것이다.

ArrayList를 생성하기 위해서는 저장할 객체 타입을 타입 파라미터로
표기하고 기본 생성자를 호출하면 된다. 
예를 들어 String을 저장하는 ArrayList는 다음과 같이 생성할 수 있다.

```java
List<String> list = new ArrayList<String>();
```

기본 생성자로 ArrayList 객체를 생성하면 내부에 10개의 
객체를 저장할 수 있는 초기 용량(capacity)를 가지게 된다.
저장되는 객체 수가 늘어나면 용량이 자동으로 증가하지만, 
처음부터 용량을 크게 잡고 싶다면 용량의 크기를 매개값으로 받는 
생성자를 이용하면 된다 .

```java
List<String> list = new ArrayList<String>(30); 
//  String 객체 30개를 저장할 수 있는 용량을 가짐
```
자바 4이전 까지는 타입 파라미터가 없었기 때문에 다음과 같이 ArrayList
객체를 생성하였다. 이렇게 생성된 ArrayList는 모든 종류의 객체를
저장할 수 있다. 그 이유는 객체가 저장될 때 Object 타입으로 변환되어
저장되기 때문이다.

```java
List list = new ArrayList();
```
모든 종류의 객체를 저장할 수 있다는 장점은 있지만,
저장할 때 Object로 변환되고 , 찾아올 때 원래 타입으로 변환해야
하므로 실행 성능에 좋지 못한 영향을 미친다. 
일반적으로 컬렉션에는 단일 종류의 객체들만 저장된다.
그래서 자바 5부터 제네릭을 도입하여 ArrayList 객체를 생성할 때
타입 파라미터로 저장할 객체의 타입을 지정함으로써 불필요한 타입 변환을
하지 않도록 했다.

이후에 소개되는 모든 컬렉션 객체들도 마찬가지 이유로 타입 파라미터를
이용해서 저장할 객체의 타입을 지정할 수 있다.

다음 코드는 자바 4 이전과 자바 5 이후의 차이점을 잘 보여준다.

```java
[자바 4 이전]
List list = new ArrayList(); // 컬렉션 생성
list.add("홍길동");    // 컬렉션에 객체를 추가
Object obj = list.get(0); // 컬렉션에서 객체 검색
String name = (String ) obj; // 타입 변환 후 홍길동을 얻을 수 있음

```

```java
[자바 5 이후]
list<String> list = new ArrayList<String>(); // 컬렉션 생성
list.add("홍길동"); // 컬렉션에 객체를 추가
String name = list.get(0); // 컬렉션에서 객체 검색, 홍길동을 바로 얻음
```

ArrayList에 객체를 추가하면 인덱스 0부터 차례대로 저장된다.
ArrayList에서 특정 인덱스의 객체를 제거하면 바로 뒤 인덱스부터
마지막 인덱스까지 모두 앞으로 1씩 당겨진다.
마찬가지로 특정 인덱스에 객체를 삽입하면 해당 인덱스부터 마지막
인덱스까지 모두 1씩 밀려난다. 만약 4번 인덱스가 제거면
5번 인덱스부터 모두 앞으로 1씩 당겨진다.

따라서 빈번한 객체 삭제와 삽입이 일어나는 곳에는 ArrayList를 
사용하는 것이 바람직하지 않다.
이런 경우라면 LinkedList를 사용하는 것이 좋다.
그러나 인덱스 검색이나, 맨 마지막에 객체를 추가하는 경우에는
ArrayList가 더 좋은 성능을 발휘한다. 

다음 예제는 ArrayList에 String 객체를 추가,검색,삭제하는 방법을
보여준다.

`ArrayListExample.java` String 객체를 저장하는 ArrayList


```java

public class ArrayListExample {

    public static void main(String[] args) {
        List<String >list = new ArrayList<String >();

        list.add("java");
        list.add("jdbc");
        list.add("Servlet/JSP");
        list.add(2,"Database");

        list.add(1,"iBATIS");
        System.out.println(list);
        System.out.println("==============");
        System.out.println("list.get(1) :" +list.get(1));

        list.remove(1);
        System.out.println("list.get(1) :" +list.get(1));
        list.remove("java");
        System.out.println("list.get(1) :" +list.get(1));

        for (int i=0; i< list.size();i++){
             String  str = list.get(i);

            System.out.println(str);
        }
        System.out.println("===================");
        list.add(1,"JPA");
        System.out.println("list.get(1) :" +list.get(1));
        System.out.println("list = " +list);

    }
}

```

ArrayList를 생성하고 런타임 시 필요에 의해 객체들을 추가하는 것이
일반적이지만, 고정된 객체들로 구성된 List를 생성할 때도 있다.

이런 경우에는 Arrays.asList(T...a) 메소드를 사용하는 것이
간편하다.

```java
List<T> list = Arrays.asList(T... a);
```

T 타입 파라미터에 맞게 asList()의 매개값을 순차적으로 입력하거나,
T[] 배열을 매개값으로 주면 된다. 
다음은 고정된 String 객체를 요소로 갖는 ArrayList 객체를 생성한다.

remove , add 메소드를 사용하면 에러 발생

```java

public class ArrayAsListExample {

    public static void main(String[] args) {
        List<String > list1 = Arrays.asList("신용권","홀길동","감자바"); // 고정된 객체들로 구성된 LIst


        System.out.println(list1);
        for (String s : list1) {
            System.out.println(s);
        }

        System.out.println();
        list1.add("박건희"); // 에러가 발생한다. UnsupportedOperationException
        System.out.println("list1 :" +list1);

        List<Integer> list2 = Arrays.asList(1,2,3);
        System.out.println(list2);




    }
}

```