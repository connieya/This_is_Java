# Hashtable

Hashtable은 HashMap과 동일한 내부 구조를 가지고 있다. Hashtable도
키로 사용할 객체는 hashCode()와 equals() 메소드를 재정의해서 동등 객체가
될 조건을 정해야 한다. HashMap과의 차이점은 Hashtable은 
동기화(synchronized) 메소드로 구성되어 있기 때문에 멀티 스레드가 
동시에 이 메소드들을 실행할 수는 없고, 하나의 스레드가 실행을 완료해야만
다른 스레드를 실행할 수 있다. 그래서 멀티 스레드 환경에서 안전하게
객체를 추가, 삭제할 수 있다. 이것을 스레드가 안전하다라고 말한다.

Hashtable의 생성 방법은 HashMap과 크게 다르지 않다. 키 타입과 값 타입을
지정하고 기본 생성자를 호출하면 된다.

```java
Map<K,V> map = new Hashtable<K,V>();
```

키로 String 타입을 사용하고, 값으로 Integer 타입을 사용하는 Hashtable은
다음과 같이 생성할 수 있다.
```java
Map<String , Integer> map = new Hashtable<String , Integer>();
```

다음은 키보드로 아이디와 비밀번호를 입력받아서 , Hashtable에 저장되어 있는
키와 값으로 비교한 후 로그인 여부를 출력하는 예제이다.

`HashtableExample.java` 아이디와 비밀번호 검사하기

```java
public class HashTableExample {

    public static void main(String[] args) {
        Map<String ,String > map = new Hashtable<String ,String >();

        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("아이디와 비밀번호를 입력하세요");
            System.out.print("아이디 : ");
            String id = scanner.nextLine();

            System.out.println("비밀번호 : ");
            String password = scanner.nextLine();

            if (map.containsKey(id)){
                if (map.get(id).equals(password)){
                    System.out.println("로그인 되었습니다");
                    break;
                }else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            }else {
                System.out.println("아이디가 존재하지 않습니다.");
            }
        }
    }
}

```