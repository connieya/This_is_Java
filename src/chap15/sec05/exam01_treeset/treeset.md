# TreeSet

TreeSet은 이진 트리(binary tree)를 기반으로 한 Set 컬렉션이다.
하나의 노드는 노드값인 value와 왼쪽과 오른쪽 자식 노드를 참조하기 위한
두 개의 변수로 구성된다. TreeSet에 객체를 저장하면 자동으로 정렬되는데
부모값과 비교해서 낮은 것은 왼쪽 자식 노드에, 높은 것은 오른쪽 자식 노드에
저장한다.

TreeSet을 생성하기 위해서는 저장할 객체 타입을 파라미터로  표기하고
기본 생성자를 호출하면 된다. 

```java
TreeSet<E> treeSet = new TreeSet<E>();
```

String 객체에 저장하는 TreeSet은 다음과 같이 생성할 수 있다.
```java
TreeSet<String> treeSet = new TreeSet<String>();
```

Set 인터페이스 타입 변수에 대입해도 되지만 TreeSet 클래스 타입으로 
대입한 이유는 객체를 찾거나 범위 검색과 관련된 메소드를 사용하기 위해서이다.

다음은 TreeSet이 가지고 있는 검색 관련 메소드들이다.

리런타입 - 메소드 - 설명
- E - first() - 제일 낮은 객체를 리턴
- E - last() - 제일 높은 객체를 리턴
- E - lower(E e) - 주어진 객체보다 바로 아래 객체를 리턴
- E - higher(E e ) - 주어진 객체보다 바로 위 객체를 리턴
- E - floor(E e) - 주어진 객체와 동등한 객체가 있으면 리턴, 만약 없다면 주어진 객체의 바로 아래의 객체를 리턴
- E - ceiling(E e) - 주어진 객체와 동등한 객체가 있으면 리턴 만약 없다면 주어진 객체의 바로 위의 객체를 리턴
- E - pollFirst() - 제일 낮은 객체를 꺼내오고 컬렉션에서 제거함
- E - pollLast() - 제일 높은 객체를 꺼내오고 컬렉션에서 제거함


다음 예제는 점수를 무작위로 저장하고 특정 점수를 찾는 방법을 보여준다.

`TreeSetExample1.java` 특정 객체 찾기 

```java

public class TreeSetExample1 {

    public static void main(String[] args) {
        TreeSet<Integer> scores= new TreeSet<Integer>();

        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));


        System.out.println("scores = " +scores);

        Integer score = null;

        score = scores.first();

        System.out.println("가장 낮은 점수: " +score);

        score = scores.last();

        System.out.println("가장 높은 점수: " +score +" \n");

        score = scores.lower(new Integer(95));

        System.out.println("95점 아래 점수 : " + score);

        score = scores.higher(new Integer(95));
        System.out.println("95점 위의 점수 : " + score);

        score = scores.floor(new Integer(95));
        System.out.println("95점이거나 바로 아래 점수 : " +score);

        score = scores.ceiling(new Integer(85));
        System.out.println("85점이거나 바로 위의 점수 : " +score);

        System.out.println();


        while (!scores.isEmpty()){
            score = scores.pollLast();
            System.out.println(score + "(남은 객체 수 : " +scores.size() +")");
        }

//        Iterator<Integer> iterator = scores.iterator();
//        while (iterator.hasNext()){
//            int s = iterator.next();
//            iterator.remove();
////            System.out.println(s);
//            System.out.println(s + "(남은 객체 수 : " +scores.size() +")");
//        }
    }
}

```

다음은 TreeSet이 가지고 있는 정렬과 관련된 메소드들이다.

리턴타입 - 메소드 - 설명
- Iterator - descendingIterator() - 내림차순으로 정렬된 Iterator를 리턴
- NavigableSet<E> - descendingSet() - 내림차순으로 정렬된 NavigableSet을 반환

descendingIterator() 메소드는 내림차순으로 정렬된 Iterator 객체를 리턴하는데
Iterator는 이미 Set 컬렉션에서 사용 방법을 살펴보았다. descendingSet() 메소드는
내림차순으로 정렬된 NavigableSet 객체를 리턴하는데 NavigableSet은
TreeSet과 마찬가지로 first(), last(), lower(), higher(), floor(),
ceiling() 메소드를 제공하고, 정렬 순서를 바꾸는 descendingSet() 메소드도
제공한다. 오름차순으로 정렬하고 싶다면 다음과 같이 descendingSet() 메소드를
두 번 호출하면 된다.

```java
NavigableSet<E> descendingSet = treeSet.descendingSet();
NavigableSet<E> ascendingSet = descendingSet.descendingSet();
```

`TreeSetExample2.java` 객체 정렬하기

```java

public class TreeSetExample2 {

    public static void main(String[] args) {

        TreeSet<Integer> scores= new TreeSet<Integer>();

        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for (Integer score : descendingSet) {

            System.out.print(score + " ");

        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        for (Integer score : ascendingSet) {

            System.out.print(score + " ");

        }
    }
}

```

다음은 TreeSet이 가지고 있는 범위 검색과 관련된 메소드들이다.

리턴타입 - 메소드 - 설명

- NavigableSet<E> - headSet(E toElement , boolean inclusive)
-주어진 객체보다 낮은 객체들을 NavigableSet으로 리턴, 주어진 객체 포함 여부는
  두 번째 매개값에 다라 달라짐 
  
- NavigableSet<E> - tailSet(E fromElement, boolean inclusive) 
-주어진 객체보다 높은 객체들을 NavigableSet으로 리턴, 주어진 객체 포험 여부는
  두번 째 매개값에 따라 달라짐
  

다음은 영어 단어를 무작위로 TreeSet에 저장한 후 알파벳 c~f 사이의
단어를 검색해보는 예제이다.

`TreeSetExample3.java` 영어 단어를 정렬하고, 범위 검색해보기

```java

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(90);
        scores.add(89);
        scores.add(92);
        scores.add(88);
        scores.add(79);
        scores.add(97);

        Integer score1 = scores.first();
        System.out.println("score1 = "+ score1);

        score1 = scores.last();
        System.out.println("score1 = " +score1);

        score1 = scores.lower(89);
        System.out.println("score1 = " +score1);
    }
}

```