# HashMap

HashMap은 Map 인터페이스를 구혀한 대표적인 Map 컬렉션이다.

HashMap의 키로 사용할 객체는 hashCode()와 equals() 메소드를
재정의해서 동등 객체가 될 조건을 정해야 한다. 동등 객체, __즉 동일한
키가 될 조건은 hashCode()의 리턴값이 같아야 하고, equals() 메소드가
true를 리턴해야 한다.__

주로 키 타입은 String을 많이 사용하는데, String은 문자열이 같을 경우 
동등 객체가 될 수 있도록 hashCode()와 equals() 메소드가 재정의되어 있다.

HashMap을 생성하기 위해서는 키 타입과 값 타입을 파라미터로 주고
기본 생성자를 호출하면 된다.

```java
Map<K , V> map = new HashMap<K, V>();
```



