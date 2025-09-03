package edu.polymorphism.pack1.ex1.model;

public class Electronics extends Product{
    // 전자제품 관련 필드들
    private int warranty; // 보증기간
    private String powerConsumption; // 전력소비량

    // {} 형태로 된 블록 접기/펼치기 단축키
    // ctrl + shift + +/-

    // 생성자
    public Electronics() {}

    public Electronics(String productName, String productId, double productPrice,
                       String productCategory, int productStock, String productDescription,
                       String productBrand, double productWeight) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
    }
    public Electronics(String productName, String productId, double productPrice,
                       int productStock, String productDescription,
                       String productBrand, double productWeight, int warranty, String powerConsumption) {
        super(productName, productId, productPrice, "전자제품", productStock, productDescription, productBrand, productWeight);
        // 생성자 'Electronics(String, String, double, int, String, String, double, int, String)'을(를) 해결할 수 없습니다
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    // getter, setter
    public int getWarranty() { return warranty; }
    public void setWarranty(int warranty) { this.warranty = warranty; }
    public String getPowerConsumption() { return powerConsumption; }
    public void setPowerConsumption(String powerConsumption) { this.powerConsumption = powerConsumption; }
}
