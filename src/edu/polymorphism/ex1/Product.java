package edu.polymorphism.ex1;

public class Product {
    // 상품 정보 관련 필드들
    protected String productName;
    protected String productId;
    protected double productPrice;
    protected String productCategory;
    protected int productStock;
    protected String productDescription;
    protected String productBrand;
    protected double productWeight;

    // 기본, 매개변수 생성자
    public Product() {
    }

    public Product(String productName, String productId, double productPrice,
                   String productCategory, int productStock, String productDescription,
                   String productBrand, double productWeight) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productBrand = productBrand;
        this.productWeight = productWeight;
    }

    // 상품 관련 메서드들
    public void displayProductInfo() {
        System.out.println("상품명: " + productName);
        System.out.println("가격: " + productPrice + "원");
        System.out.println("재고: " + productStock + "개");
        System.out.println("브랜드: " + productBrand);
    }

    public void updateProductStock(int quantity) {
        this.productStock += quantity;
        System.out.println("재고가 업데이트되었습니다. 현재 재고: " + this.productStock);
    }

    public void sellProduct(int quantity) {
        if (this.productStock >= quantity) {
            this.productStock -= quantity;
            System.out.println(quantity + "개 판매되었습니다. 남은 재고: " + this.productStock);
        } else {
            System.out.println("재고가 부족합니다.");
        }
    }

    public void applyDiscount(double discountRate) {
        double discountedPrice = productPrice * (1 - discountRate);
        System.out.println("할인가: " + discountedPrice + "원 (할인율: " + (discountRate * 100) + "%)");
    }
}
