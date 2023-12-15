package chap2;

public class JavaBeansSubway {
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

    public JavaBeansSubway() {}

    public void setId(Long id) {
        this.id = id;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setIsSet(String isSet) {
        this.isSet = isSet;
    }

    @Override
    public String toString() {
        return "JavaBeansSubway [id=" + id + ", menuName=" + menuName + ", bread=" + bread + ", topping=" + topping
                + ", vegetable=" + vegetable + ", sauce=" + sauce + ", isSet=" + isSet + "]";
    }
}