package edu.practice.day8.model.onlineShopping;

public class Amazon implements OnlineShopping{
    // 필드
    private String product;

    // 생성자
    public Amazon() {
    }
    public Amazon(String product) {
        this.product = product;
    }

    // getter, setter
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }

    // 메서드 재정의
    @Override
    public void browse() {
        System.out.printf("🔍 아마존에서 %s을(를) 검색합니다.", getProduct());
    }

    @Override
    public void addToCart() {
        System.out.printf("🛒 %s을(를) 아마존 장바구니에 담았습니다!", getProduct());
    }

    @Override
    public void purchase() {
        System.out.printf("💳 아마존에서 %s 결제 완료! 내일 도착 예정!", getProduct());
    }
}
