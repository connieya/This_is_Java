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

키와 갑의 타입은 기본 타입(byte , short , int , float , double, boolean,char)
을 사용할 수 없고 클래스 및 인터페이스 타입만 가능하다. 키로 String
타입을 사용하고 값으로 Integer 타입을 사용하는 HashMap은
다음과 같이 생성할 수 있다.
```java
Map<String , Integer> map = new HashMap<String, Integer>();
```

다음 예제는 이름을 키로, 점수를 값으로 저장하는 HashMap 사용 방법을
보여준다.

`HashMapExample1.java` 이름을 키로 점수를 값으로 저장하기

```java

public class HashMapExample1 {

    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<String ,Integer>();

        map.put("신용권",85);
        map.put("홍길동",90);
        map.put("동장군",80);
        map.put("홍길동",95); // 중복 저장되지 않기 때문에  ,value가 95인 홍길동 키가 저장된다.

        System.out.println("총 엔트리 수 : " +map.size());

        System.out.println("홍길동 : " +map.get("홍길동"));
        System.out.println();

        Set<String >  keySet = map.keySet();
        Iterator<String > keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " +value);
        }
        System.out.println();
        map.remove("홍길동");

        System.out.println("총 Entry 수 : " + map.size());

        // 객체를 하나씩처리
        Set<Map.Entry<String ,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String ,Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()){
            Map.Entry<String ,Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" +key + " : " +value );
        }
        System.out.println();

        // 객체 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());



    }
}

```

다음 예제는 사용자 정의 객체인 Student를 키로하고 점수를 저장하는 HashMap
사용 방법을 보여준다. 학번과 이름이 동일한 Student를 동등 키로 간주하기
위해 Student 클래스에는 hashCode() 와 equals() 메소드가 재정의되어
있다.


`Student.java` 키로 사용할 객체 - hashCode() 와 equals() 재정의

```java

public class Student {

    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student){
            Student student = (Student) o;
            return sno == student.sno && name.equals(student.name);
        }else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name);
    }
}

```

`HashMapExample2.java` 학번과 이름이 동일한 경우 같은 키로 인식

```java

public class HashMapExample2 {

    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student,Integer>();

        map.put(new Student(1,"홍길동") , 95);
        map.put(new Student(1,"홍길동") , 90);

        System.out.println("총 Entry 수 : "+  map.size());

        System.out.println(map.get(new Student(1,"홍길동")));
    }
}

```
총 Entry 수 : 1