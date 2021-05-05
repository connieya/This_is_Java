# Map 컬렉션

Map 컬렉션은 키(key) 와 값(value) 으로 구성된 Entry 객체를
저장하는 구조를 가지고 있다. 여기서 키와 값은 모두 객체이다.
키는 중복 저장될 수 없지만 값은 중복 저장될 수 있다. 만약 
기본에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고
새로운 값으로 대치된다.

Map 컬렉션에는 HashMap , Hashtable , LinkedHashMap , Properties,
TreeMap 등이 있다. 

다음은 Map 컬렉션에서 공통적으로 사용 가능한 Map 인터페이스의 
메소들이다. 키로 객체들을 관리하기 때문에 키를 매개값으로 갖는
메소드가 많다.

### 객체 추가

- V put(K key , V value) - 주어진 키로 값을 저장, 새로운 키일 경우
null을 리턴하고 동일한 키가 있을 경우 값을 대체하고 이전 값을 리턴

### 객체 검색
- boolean containsKey(Object key) - 주어진 키가 있는지 여부
- boolean containsValue(Object value) - 주어진 값이 있는지 여부
- V get(Object key) - 주어진 키가 있는 값을 리턴
- Set<Map.Entry<K,V>> entrySet() - 키와 값의 쌍으로 구성된 모든 
Map.Entry 객체를 Set에 담아서 리턴
 - boolean isEmpty() - 컬렉션이 비어 있는지 여부
- Set<K> keySet() - 모든 키를 Set 객체에 담아서 리턴
- int size() 저장된 키의 총 수를 리턴
- Collection<V> values() - 저장된 모든 값을 Collection에 담아서 리턴

### 객체 삭제
- void clear() - 모든 Map.Entry(키와 값)를 삭제
- V remove(Object key) - 주어진 키와 일치하는 Map.Entry를 삭제하고
값을 리턴
  
위에서 메소드의 매개 변수 타입과 리턴 타입에 K와 V라는 타입 파라미터가 있는데
, 이것은 Map 인터페이스가 제네릭 타입이기 때문이다. 
앞에서도 언급했듯이 구체적인 타입은 구현 객체를 생성할 때 결정된다.
객체 추가는 put() 메소드를 사용하고, 키로 객체를 찾아올 때에는 
get() 메소드를 사용한다. 그리고 객체 삭제는 remove() 메소드를 사용한다.

```java
Map<String , Integer> map = ~;

map.put("홍길동",30); // 객체 추가
int score = map.get("홍길동"); // 객체 찾기
map.remove("홍길동") // 객체 삭제
```

키를 알고 있다면 get() 메소드로 간단하게 객체를 찾아오면 되지만,
저장된 전체 객체를 대상으로 하나씩 얻고 싶을 경우에는 두 가지
방법을 사용할 수 있다. 첫 번째는 ketSet() 메소드로 모든 키를 
Set 컬렉셭으로 얻은 다음, 반복자를 통해 킬르 하나씩 얻고 get() 메소드를
통해 값을 얻으면 된다.

```java
Map<K,V> map = ~;
Set<K> keySet = map.keySet();
Iterator<K> keyIterator = keySet.iterator();
while(keyIterator.hasNect()){
    K key = keyIterator.next();
    V value = map.get(key);
        }
```

두 번째 방법은 entrySet() 메소드로 모든 Map.Entry를 Set 컬렉션으로
얻은 다음, 반복자를 통해 Map.Entry를 하나씩 얻고 getKey() 와
getValue() 메소드를 이용해 키와 값을 얻으면 된다.

```java
Set<Map.Entry<K,V>> entrySet = map.entrySet();
Iterator<Map.Entry<K,V>> entryIterator = entrySet.iterator();
while(entryIterator.hasNext()){
    Map.Entry<K,V> entry = entryIterator.next();
    K key = entry.getKey();
    V value = entry.getValue();
}
```

