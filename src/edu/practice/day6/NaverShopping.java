package edu.practice.day6;

public class NaverShopping extends NaverService {
    // 필드
    private int point;      // 적립금
    private int cartCount;  // 장바구니 개수

    // 기본생성자
    public NaverShopping() {
    }
    // 필수생성자 - 4개
    public NaverShopping(String serviceName, String userId, String userNickname, int userLevel) {
        super(serviceName, userId, userNickname, userLevel);
    }
    // 필수생성자 - 6개
    public NaverShopping(String serviceName, String userId, String userNickname, int userLevel, int point, int cartCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.point = point;
        this.cartCount = cartCount;
    }

    // 오버라이드
    @Override
    public void search() {
        System.out.println("쇼핑몰에서 상품을 검색합니다.");
    }
    @Override
    public void writeContent() {
        System.out.println("상품 리뷰를 작성합니다.");
    }

    // 고유 메서드
    public void addToCart() {
        System.out.println(serviceName + "님이 장바구니에 상품을 추가했습니다.");
        cartCount++;
    }
    public void buyProduct() {
        System.out.println(serviceName + "님이 상품을 구매했습니다.");
        point++;
    }

    // getter, setter
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
    public int getCartCount() {
        return cartCount;
    }
    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }
}
