package item_07;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 메모리 누수가 일어나는 위치는 어디인가?
 * 이 스택을 사용하는 프로그램을 오래 실행하다 보면 점차 가비지 컬렉션 활동과 메모리 사용량이 늘어나 결국 성능이 저하될 것이다.
 * 이 코드에서는 스택이 커졌다가 줄어들었을 떄 스택에서 꺼내진 객체들을 가비지 컬렉터가 회수 하지않는다.
 * 스택이 객체들의 다 쓴 참조(obsolete reference)를 여전히 가지고 있기 때문이다.
 * 여기서 다 쓴 참조란 문자 그대로 앞으로 다시 쓰지 않을 참조를 뜻 한다.
 * elements 배열의 '활성 영역' 밖의 참조들이 모두 여기에 해당한다.
 * 활성 영역은 인덱스가 size보다 작은 원소들로 구성된다.
 *
 * 해법은 간단하다.
 * 해당 참조를 다 썼을 때 null 처리하면 된다.
 */
public class Stack {
    private Object[] elements;

    private int size = 0;

    private static final  int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        // 변경 전 코드
//        if (size == 0) throw new EmptyStackException();
//        return elements[--size];

        // 변경 후 코드
        if (size == 0) throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;  // 다 쓴 참조 해제
        return result;
    }

    /**
     * 원소를 위한 공간을 적어도 하나 이상 확보한다.
     * 배열 크기를 늘려야 할 때마다 대략 두 배씩 늘린다.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
