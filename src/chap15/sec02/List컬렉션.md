# List 컬렉션

List 컬렉션은 객체를 일렬로 늘어놓은 구조를 가지고 있다. 
객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동 인덱스가 
부여되고 인덱스로 객체를 검색, 삭제할 수 있는 기능을 제공한다. 
List 컬렉션은 객체 자체를 저장하는 것이 아니라 객체의 번지를 참조한다.
동일한 객체를 중복 저장할 수 있는데, 이 경우 동일한 번지가 참조된다.
null도 저장이 가능한데, 이 경우 해당 인덱스는 객체를 참조하지 않는다.

List 컬렉션에는 ArrayList, Vector , LinkedList 등이 있는데,
다음은 List 컬렉션에서 공통적으로 사용 가능한 List 인터페이스의
메소드들이다. 인덱스로 객체를 관리하기 때문에 인덱스를 매개값으로
갖는 메소드가 많다.


### 객체 추가
- boolean add(E e) : 주어진 객체를 맨 끝에 추가
- void add(int index, E element) : 주어진 인덱스에 객체를 추가
- E set(int index , E element) : 주어진 인덱스에 저장된 객체를 주어진 객체로
바꿈
  
### 객체 검색
- boolean contains(Object o) : 주어진 객체가 저장되어 있는지 여부
- E get(int index) : 주어진 인덱스에 저장된 객체를 리턴
- boolean isEmpty() : 컬렉션이 비어 있는지 조사
- int size() : 저장되어 있는 전체 객체 수를 리턴

### 객체 삭제
- void clear() : 저장된 모든 객체를 삭제
- E remove(int index) : 주어진 인덱스에 저장된 객체를 삭제
- boolean remove(Object O) : 주어진 객체를 삭제


위에서 메소드의 매개 변수 타입과 리턴 타입에 E라는 타입 파라미터가
있는데, 이것은 List 인터페이스가 제네릭 타입이기 때문이다.

구체적인 타입은 구현 객체를 생성할 때 결정된다. 
객체 추가는 add() 메소드를 사용하고, 객체를 찾아올 때에는
get() 메소드를 사용한다. 그리고 객체 삭제는 remove() 메소드를 사용한다.

다음은 List 컬렉션에 저장되는 구체적인 타입을 String으로 정해놓고,
추가, 삽입, 찾기 그리고 삭제하는 방법을 보여준다.

```java
List<String> list = ...;
list.add("홍길동"); // 맨끝에 객체 추가
list.add(1,"신용권"); // 지정된 인덱스에 객체 삽입
String str = list.get(1); // 인덱스로 객체 찾기
list.remove(0); // 인덱스로 객체 삭제
list.remove("신용권") // 객체 삭제
```

만약 전체 객체를 대상으로 하나씩 반복해서 저장된 객체를 얻고 싶다면
다음과 같이 for문을 사용할 수 있다. 
```java
List<String> list = ...;
for(int i=0; i<list.size(); i++ ){
    String str = list.get(i);    
}
```
인덱스가 필요 없다면 향상된 for문을 이용하는 것이 더욱 편리하다.
```java
for(String str : list){
    
        }
```
