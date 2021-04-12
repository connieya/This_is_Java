## Set 컬렉션

List 컬렉션은 저장 순서를 유지하지만,
Set 컬렉션은 저장 순서가 유지되지 않는다. 
또한 객체를 중복해서 저장할 수 없고 하나의 null만 저장할 수 있다.

set 컬렉션은 수학의 집합에 비유될 수 있다.
집합은 순서와 상관없고 중복이 허용되지 않기 때문이다.

Set 컬렉션은 또한 구슬 주머니와도 같다.
동일한 구슬을 두 개 넣을 수 없고, 
들어갈 때의 순서와 나올 때의 순서가 다를 수도 있기 때문이다.

********

Set 컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없다.
대신 , 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자를 제공한다.

반복자는 Iterator 인터페이스를 구현한 객체를 말하는데, 
iterator() 메소드를 호출하면 얻을 수 있다.

### HashSet

Set은 중복해서 저장할 수 없다.
```java
public class HashSetExample2 {

    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("홍길동",30));
        set.add(new Member("홍길동",30));

        System.out.println("총 객체 수 :" + set.size());
    }
}

```

원래라면 위에 새로운 맴버 객체를 add() 메세드에 담는데,
내용은 같지만 new 연산자를 사용했기 때문에
둘은 다른 객채로 간주하여 set에 2번 저장 된다 (중복이 아니기 때문에)
즉 총 객채수가 2가 된다.

하지만 hashCode() 와 equals를 오버라이딩 했기 때문에
같인 데이터로 간주하고, 중복 저장 할 수 업으니 총 객체 수는 1개가 된다.