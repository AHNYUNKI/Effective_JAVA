package item_03.singleton_public;

/**
 * 장점 - API를 바꾸지 않고도 싱글톤이 아니게 변경할 수 있다는 점이다.
 *       유일한 인스턴스를 반환하던 팩터리 메서드가 호출하는 스레드별로 다른 인스턴스를 넘겨주게 할 수 있다.
 *       또, 원한다면 정적 팩터리를 제네릭 싱글턴 팩터리로 만들 수 있다는 점이다.
 *       그리고 마지막으로 정적 팩터리의 메서드 참조를 공급자로 사용할 수 있다는 점이다.
 *       가령 Elvis::getInstance를 Supplier<Elvis>로 사용하ㄴㄴ 식이다.
 */
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {
        // ...
    }
    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        // ...
    }
}
