package chap2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
         * 변수 초기화
         */
        Long id = 1L;
        System.out.print("메뉴이름을 입력해 주세요:");
        String menu = scanner.nextLine();
        System.out.print("빵종류를 입력해 주세요:");
        String bread = scanner.nextLine();
        System.out.print("토핑을 입력해 주세요:");
        String topping = scanner.nextLine();
        System.out.print("야채를 입력해 주세요:");
        String vegetable = scanner.nextLine();
        System.out.print("소스를 입력해 주세요:");
        String sauce = scanner.nextLine();
        System.out.print("세트 여부를 입력해 주세요(T 또는 F):");
        String isSet = scanner.nextLine();;

        /*
         * 점층적 생성자 패턴
         */
        TelescopingConstructorSubway telescopingConstructorSubway = new TelescopingConstructorSubway(id, menu, bread, topping, vegetable, sauce);
        System.out.println(telescopingConstructorSubway);

        /*
        * 자바 빈즈 패턴
        */
        JavaBeansSubway javaBeansSubway = new JavaBeansSubway();
        javaBeansSubway.setId(id);
        javaBeansSubway.setMenuName(menu);
        javaBeansSubway.setBread(bread);
        javaBeansSubway.setTopping(topping);
        javaBeansSubway.setVegetable(vegetable);
        javaBeansSubway.setSauce(sauce);
        javaBeansSubway.setIsSet(isSet);

        System.out.println(javaBeansSubway);
        
        /*
         * 빌더 패턴
         */
        Subway subway = new SubwayBuilder(id)
                            .menu(menu)
                            .bread(bread)
                            .topping(topping)
                            .vegetable(vegetable)
                            .sauce(sauce)
                            .set(isSet)
                        .build();

        System.out.println(subway);
        scanner.close();
    }
}