package item_04;

/**
 * 인스턴스화를 막으려거든 private 생성자를 사용하라.
 * 꼭 AssertionError를 던질 필요는 없지만, 클래스 안에서 실수로라도 생성자를 호출하지 않도록 해준다.
 */
public class UtilityClass {
    // 기본 생성자가 만들어지는 것을 막는다(인스턴스화 방지용)
    private UtilityClass() {
        throw new AssertionError();
    }
    // ... 나머지 코드는 생략
}
