package item_02.javaBeansPattern;

/**
 * 자바빈즈 패턴 -> 일관성이 깨지고, 불변으로 만들 수 없다.
 */
public class NutritionFacts {
    // 매개변수들은 (기본 값이 있다면) 기본 값으로 초기화 된다.
    private int servingSize = -1;   // 필수; 기본값 없음
    private int servings = -1;  // 필수; 기본값 없음
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts() {}

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    /**
     * 점층적 생성자 패턴의 단점들이 사라짐.
     * 코드가 길어지긴 했으나, 인스턴스를 만들기 쉽고, 그 결과 더 읽기 쉬운 코드가 됨
     */
}
