package chap2;

public class Subway {
    
    /* 
    불변 필드
    */

	// 써브웨이 주문 번호
    private Long id;

    /* 
	가변 필드
    */

    // 메뉴 이름
    private String menuName;
    
    // 빵 종류
    private String bread;
    
    // 토핑 종류
    private String topping;

    // 야채 종류
    private String vegetable;
    
    // 소스 종류
    private String sauce;

    // 세트 유무
    private String isSet;

    public Subway(Long id, String menuName, String bread, String topping, String vegetable, String sauce, String isSet) {
        this.id = id;
        this.menuName = menuName;
        this.bread = bread;
        this.topping = topping;
        this.vegetable = vegetable;
        this.sauce = sauce;
        this.isSet = isSet;
    }

    @Override
    public String toString() {
        return "Subway [id=" + id + ", menuName=" + menuName + ", bread=" + bread + ", topping=" + topping
                + ", vegetable=" + vegetable + ", sauce=" + sauce + ", isSet=" + isSet + "]";
    }
}