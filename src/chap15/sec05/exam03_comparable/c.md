# Comparable 과 Compartor

TreeSet의 객체와 TreeMap의 키는 저장과 동시에 자동 오름차순으로 정렬되는데,
숫자(Integer, Double) 타입일 경우에는 값으로 정렬하고, 문자열(String) 타입일
경우에는 유니코드로로 정렬한다. TreeSet과 TreeMap은 정렬을 위해 java.lang.Comparable
을 구현한 객체를 요구하는데, Integer , Double, String은 모두 Comparable 인터페이스를
구현하고 있다. 사용자 정의 클래스도 Comparable을 구현한다면 자동 정렬이 가능하다.
Comparable에는 compareTo() 메소드가 정의되어 있기 때문에
사용자 정의 클래스에서는 이 메소드를 오버라이딩하여 다음과 같이 리턴값을 만들어 내야한다.

|리턴 타입| 메소드 | 설명
|:---|:---|:---|
|int | compareTo(T o)|주어진 객체와 같으면 0을 리턴<br/> 주어진 객체보다 적으면 음수를 리턴<br/>주어진 객체보다 크면 양수를 리턴|

다음은 나이를 기준으로 Person 객체를 오름차순으로 정렬하기 위해 Comparable 인터페이스를 구현한 것이다.
나이가 적을 경우에는 -1을, 동일한 경우는 0을, 클 경우는 1을 리턴하도록 compareTo() 메소드를 
재정의하였다.


`Comparable 구현 클래스`
```java
public class Person implements Comparable<Person> {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age) return  -1;
        else if (age == o.age) return 0;
        else return 1;
    }
}

```

`ComparableExample.java` 사용자 정의 객체를 나이 순으로 정렬하기

```java
public class ComparableExample {

    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("홍길동",45));
        treeSet.add(new Person("김자바",25));
        treeSet.add(new Person("박지원",31));

        Iterator<Person> iterator = treeSet.iterator();

        while (iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person.name + ": " +person.age);
        }
    }
}
```

TreeSet의 객체와 TreeMap의 키가 Comparable을 구현하고 있지 않을 경우에는
저장하는 순간 ClassCastExecption이 발생한다. 그렇다면 Comparable 비구현 객체를 정렬하는
방법은 없을까? TreeSet 또는 TreeMap 생성자의 매개값으로 정렬자(Comparator)를 제공하면 
Comparable 비구현 객체도 정렬시킬 수 있다.



정렬자는 Comparator 인터페이스를 구현한 객체를 말하는데, Comparator 인터페이스에는 다음과 같이
메소드가 정의되어 있다.

|리턴 타입 | 메소드 | 설명 |
|:---|:---|:----|
|int | compare(T o1, T o2)| o1과 o2가 동등하다면 0을 리턴<br/> o1이 o2보다 앞에 오게 하려면 음수를 리턴 <br/>o1이 o2보다 뒤에 오게 하려면 양수를 리턴 

compare() 메소드는 비교하는 두 객체가 동등하면 0, 비교하는 값보다 앞에 오게 하려면 음수, 뒤에 오게 하려면
양수를 리턴하도록 구현하면 된다. 다음은 가격을 기준으로 Fruit 객체를 내림차순으로 정렬 시키는 정렬자이다.

`DescendingComparator.java` Fruit의 내림차순 정렬자

```java
public class DescendingComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return 0;
    }
}
```

`Fruit.java` Comparable을 구현하지 않은 클래스

```java

public class Fruit {
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

```

다음 예제는 내림차순 정렬자를 이용해서 TressSet에 Fruit을 저장한다. 정렬자를 주지 않고 TressSet에
저장하면 ClassCastException 예외가 발생하지만, 정렬자를 TressSet의 생성자에 주면
예외가 발생하지 않고 자동적으로 내림차순 정렬되는 것을 볼 수 있다.

`ComparableExample.java` 내림차순 정렬자를 사용하는 TrssSet

```java
public class ComparatorExample {

    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());

        treeSet.add(new Fruit("포도",3000));
        treeSet.add(new Fruit("수박",10000));
        treeSet.add(new Fruit("딸기",6000));

        Iterator<Fruit> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + " - "+fruit.price );
        }
    }
}
```