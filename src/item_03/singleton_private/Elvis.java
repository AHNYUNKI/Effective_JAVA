package item_03.singleton_private;

/**
 * 장점 - 해당 클래스가 싱글턴임이 API에 명확히 드러난다는 것이다.
 *       public static 필드가 final이니 절대로 다른 객체를 참조 할 수 없다.
 *       그리고 간결하다.
 */
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {
        // ...
    }

    public void leaveTheBuilding() {
        // ...
    }
}
