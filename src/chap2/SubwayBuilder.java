package chap2;

public class SubwayBuilder {
    private Long id;

    // 메뉴 이름
    private String menu;
    
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

    public SubwayBuilder(Long id) {
        this.id = id;
    }

    public SubwayBuilder menu(String menu) {
        this.menu = menu;
        return this;
    }

    public SubwayBuilder bread(String bread) {
        this.bread = bread;
        return this;
    }

    public SubwayBuilder topping(String topping) {
        this.topping = topping;
        return this;
    }

    public SubwayBuilder vegetable(String vegetable) {
        this.vegetable = vegetable;
        return this;
    }

    public SubwayBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public SubwayBuilder set(String isSet) {
        this.isSet = isSet;
        return this;
    }

    public Subway build() {
        return new Subway(id, menu, bread, topping, vegetable, sauce, isSet);
    }
}