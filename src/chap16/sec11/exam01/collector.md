# 필터링한 요소 수집

Stream의 collect(Collector<T,A,R> collector) 메소드는 필터링 또는 매핑된 요소들을 새로운 컬렉션에 수집하고, 이 컬렉션을 리턴한다.

|리턴타입 | 메소드(매개 변수) | 인터페이스
|:---|:---|:----|
| R | collect(Collector<T,A,R> collector) | Stream

- 매개값인 Collector(수집기)는 어떤 요소를 어떤 컬렉션에 수집할 것인지를 결정한다.
- Collector의 타입 파라미터 T는 요소이고, A는 누적기(accumulator)이다.
- R은 요소가 저장될 컬렉션이다.
- 해석하면 T 요소를 A 누적기가 R에 저장한다는 의미이다.
- Colector의 구현 객체는 Collectors 클래스의 다양한 정적 메소드를 이용해서 얻을 수 있다.

|리턴 타입| Collectors의 정적 메소드 | 설명
|:---|:----|:----|
|Collector<T,?,List<T>>| toList() | T를 List에 저장
|Collector<T,?Set<T>> | toSet() | T를 Set에 저장
|Collector<T,?,Collection<T>> | toCollection(Supplier<Collection<T>>) | T를 Suppier가 제공한 Collection에 저장
|Collector<T,?,Map<K,U>> | toMap(Function<T,K>keyMapper,Function<T,U>valueMapper)|T를 K와U로 매핑해서 K를 키로, U를 값으로 Map에 저장
|Collector<T,?,ConcurrentMap<K,U>> | toConcurrentMap(Function<T,K> keyMapper,Function<T,U> valueMapper) | T를 K와 U로 매핑해서 K를 키로, U를 값으로 ConcurrentMap에 저장

- 리턴값인 Collector를 보면 A(누적기) 가 ?로 되어 있다.
- 이것은 Collector가 R(컬렉션)에 T(요소)를 저장하는 방법을 알고 있어 A(누적기)가 필요 없기 때문이다. 
- Map과 ConcurrentMap의 차이점은 Map은 스레드에 안전하지 않고, ConcurrentMap은 스레드에 안전하다.
- 멀티 스레드 환경에서 사용하려면 ConcurrentMap을 얻는 것이 좋다. 

```java
public class CollectorExample {
    Stream<Student> totalStream = totalList.stream();
    Stream<Student> maleStream = totalStream.filter(s -> s.getSex() == Student.Sex.MALE);
    Collector<Student, ?, List<Student>> collector = Collectors.toList();
    List<Student> maleList = maleStream.collect(collector);
    }
```

1 . 전체 학생 List에서 Stream을 얻는다.
2. 남학생만 필터링해서 Stream을 얻는다.
3. List에 Student를 수집하는 Collector를 얻는다.
4. Stream에서 Collect() 메소드로 Student를 수집해서 새로운 List를 얻는다. 

변수를 생략하면 다음과 같이 작성 할 수 있다.
```java
List<Student> maleList = totalList.stream()
                .filter(student -> student.getSex() == Student.Sex.MALE)
                .collect(Collectors.toList());
```

전체 학생 중 여학생 들만 필터링 해보자

```java
Stream<Student> totalStream = totalList.stream();
        Stream<Student> femaleStream = totalStream.filter(student -> student.getSex() == Student.Sex.FEMALE);
        Supplier<HashSet<Student>> supplier = HashSet :: new;
        Collector<Student, ?, HashSet<Student>> collector = Collectors.toCollection(supplier);
        Set<Student> femaleSet = femaleStream.collect(collector);
```

1. 전체 학생 List에서 Stream을 얻는다.
2. 여학생만 필터링해서 Stream을 얻는다.
3. 해로운 HashSet을 공급하는 Supplier를 얻는다.
4. Supplier가 공급하는 HashSet에 Student를 수집하는 Collector를 얻는다.
5. Stream에서 collect() 메소드로 Student를 수집해서 새로운 HashSet을 얻는다.

```java
HashSet<Student> collect = totalList.stream()
                .filter(student -> student.getSex() == Student.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));
```

```java
 public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동",10,Student.Sex.MALE),
                new Student("김수애",6,Student.Sex.FEMALE),
                new Student("신용권" , 10,Student.Sex.MALE),
                new Student("박수미",6,Student.Sex.FEMALE)
        );

        //남학생들만 묶어 List 생성
        List<Student> maleList = totalList.stream().filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(Collectors.toList());

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        // 여학생들만 묶어 HashSet 생성
        Set<Student> femaleSet = totalList.stream().filter(f -> f.getSex() == Student.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));

        femaleSet.stream().forEach(a -> System.out.println(a.getName()));
    }
```