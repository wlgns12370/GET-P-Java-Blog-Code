package chap2;

public class TelescopingConstructorSubway {
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

    public TelescopingConstructorSubway() {}

    public TelescopingConstructorSubway(Long id) {
        this.id = id;
    }

    public TelescopingConstructorSubway(Long id, String menuName) {
        this(id);
        this.menuName = menuName;
    }

    public TelescopingConstructorSubway(Long id, String menuName, String bread) {
        this(id, menuName);
        this.bread = bread;
    }

    public TelescopingConstructorSubway(Long id, String menuName, String bread, String topping) {
        this(id, menuName, bread);
        this.topping = topping;
    }

    public TelescopingConstructorSubway(Long id, String menuName, String bread, String topping, String vegetable) {
        this(id, menuName, bread, topping);
        this.vegetable = vegetable;
    }

    // 세트 유무만 기본값인 생성자
    public TelescopingConstructorSubway(Long id, String menuName, String bread, String topping, String vegetable, String sauce) {
        this(id, menuName, bread, topping, vegetable);
        this.sauce = sauce;
    }

    // 소스 종류만 기본값인 생성자
    // public TelescopingConstructorSubway(Long id, String menuName, String bread, String topping, String vegetable, String isSet) {
    //     this(id, menuName, bread, topping, vegetable);
    //     this.isSet = isSet;
    // }

    public TelescopingConstructorSubway(Long id, String menuName, String bread, String topping, String vegetable, String sauce, String isSet) {
        this(id, menuName, bread, topping, vegetable, sauce);
        this.isSet = isSet;
    }

    @Override
    public String toString() {
        return "TelescopingConstructorSubway [id=" + id + ", menuName=" + menuName + ", bread=" + bread + ", topping="
                + topping + ", vegetable=" + vegetable + ", sauce=" + sauce + ", isSet=" + isSet + "]";
    }
}
