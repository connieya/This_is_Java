# Stack

Stack 클래스는 LIFO 자료구조를 구현한 클래스이다. 다음은 Stack 클래스의
주요 메소드들이다.

리턴타입 - 메소드 - 설명
- E - push(E item) - 주어진 객체를 스택에 넣는다.
- E - peek()  - 스택의 맨 위 객체를 가져온다. 객체를 스택에서 제거하지 않는다.
- E - pop() - 스택의 맨 위 객체를 가져온다. 객체를 스택에서 제거한다.

Stack 객체를 생성하기 위해서는 저장할 객체 타입을 파라미터로 표기하고
기본 생성자를 호출하면 된다. 

```java
Stack<E> stack = new Stack<E>();
```

다음은 택시에서 많이 볼수 있는 동전 케이스를 Stack클래스로 구현한 예이다.
동전케이스는 위에만 오픈되어 있는 스택 구조를 가지고 있다.
먼저 넣은 동전은 제일 밑에 깔리고 나중에 넣은 동전이 위에 쌓이기 때문에
Stack에서 동전을 빼면 마지막에 넣은 동전이 먼저 나온다.

`Coin.java` 동전 클래스

```java

public class Coin {

    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}

```

`StackExample.java`  stack를 이용한 동전 케이스 

```java

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<Coin>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while (!coinBox.isEmpty()){
            Coin coin = coinBox.pop();

            System.out.println("꺼내온 동전 : "+coin.getValue());
        }
    }
}

```

