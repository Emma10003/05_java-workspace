package edu.oop.basic.ex;

public class Product {
    private String pName;
    private int price;
    private String brand;

    // 기본 생성자
    public Product() {
    }

    // 필수 생성자
    public Product(String pName, int price, String brand) {
        this.pName = pName;
        this.price = price;
        this.brand = brand;
    }

    // getter
    public String getpName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    // 메서드
    public void information(){
        System.out.printf("제품명: %s\n", getpName());
        System.out.printf("가격: %d원\n", getPrice());
        System.out.printf("브랜드: %s\n\n", getBrand());
    }

}
