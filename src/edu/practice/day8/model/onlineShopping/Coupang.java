package edu.practice.day8.model.onlineShopping;

public class Coupang implements OnlineShopping{
    // 필드
    private String item;

    // 생성자
    public Coupang() {
    }
    public Coupang(String item) {
        this.item = item;
    }

    // getter, setter
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }

    // 메서드 재정의
    @Override
    public void browse() {
        System.out.printf("🔍 쿠팡에서 %s을(를) 둘러봅니다.", getItem());
    }

    @Override
    public void addToCart() {
        System.out.printf( "🛒 %s을(를) 쿠팡 장바구니에 쏙!", getItem());
    }

    @Override
    public void purchase() {
        System.out.printf("💳 쿠팡에서 %s 주문! 로켓배송으로 내일 도착!", getItem());
    }
}
