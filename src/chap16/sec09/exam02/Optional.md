# Optional 클래스

- Optional , OptionalDouble , OptionalInt , OptionalLong 클래스들은 저장하는 값의 타입만 다를 뿐 제공하는 기능은 거의 동일하다
- Optional 클래스는 단순히 집계 값만 저장하는 것이 아니라 , 집계 값이 존재하지 않을 경우 디폴트 값을  설정할 수도 있고,
집계 값을 처리하는 Consumer도 등록할 수 있다.
  
<table>
<thead>
<th>리턴타입</th>
<th>메소드(매개 변수)</th>
<th>설명</th>
</thead>
<tbody>
<tr>
<td>T<br/>double<br/>int<br/>long</td>
<td>orElse(T)<br/>orElse(double)<br>orElse(int)<br>orElse(long)</td>
<td>값이 저장되어 있지 않을 경우 디폴트 값 지정</td>
</tr>
<tr>
<td>void</td>
<td>ifPresent(Consumer)<br>ifPresent(DoubleConsumer)<br>ifPresent(intConsumer)<br>ifPresent(LongConsumer)</td>
<td>값이 저장되어 있을 경우 Consumer 에서 처리</td>
</tr>
</tbody>
</table>

컬렉션의 요소는 동적으로 추가되는 경우가 많다. 만약 컬렉션의 요소가 추가되지 않아 저장된 요소가 없을 경우 다음  코드는 어떻게 될까?

```java
       List<Integer> list = new ArrayList<>();
        // NoSuchElementException 발생
        double avg = list.stream()
        .mapToInt(Integer :: intValue)
        .average()
        .getAsDouble();

```

- 요소가 없기 때문에 평균값도 있을 수 없다. 그래서 NoSuchElementException 예외가 발생한다.
- 요소가 없을 경우 예외를 피하는 세 가지 방법이 있는데,
- 첫 번째는 Optional 객체를 얻어 isPresent() 메소드로 평균값 여부를 확인하는 것이다.
- isPresent() 메소드가 true를 리턴할 때만 getAsDouble() 메소드로 평균값을 얻으면 된다.

```java
   // 방법1
        OptionalDouble optional = list
                .stream()
                .mapToInt(Integer :: intValue)
                .average();

        if (optional.isPresent()){
            System.out.println("방법 1_평균 : "+optional.getAsDouble());
        }else {
            System.out.println("방법1_ 평균 : 0.0");
        }
```

- 두 번째 방법은 orElse() 메소드로 디폴트 값을 정해 놓는다. 평균값을 구할 수 없는 경우에는 orElse()의 매개값이 디폴트 값이 된다.
```java
      // 방법2
        double avg2 = list
                .stream()
                .mapToInt(Integer :: intValue)
                .average().orElse(0.0);
        System.out.println("빙밥2_ 평균 :" +avg2);
```

- 세 번째 방법은 ifPresent() 메소드로 평균값이 있을 경우에만 값을 이용하는 람다식을 실행한다.

```java
    //방법3
        list.stream()
                .mapToInt(Integer::intValue).
                average()
                .ifPresent(a -> System.out.println("방법 3_평균: "+a));
```