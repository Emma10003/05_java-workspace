package edu.practice.day4;

/**
 * 카페 주문 관리 시스템 클래스
 */
public class CafeOrder {
    /* 필드 */
    // static + final
    public static final String CAFE_NAME = "코딩카페";
    public static final double TAX_RATE = 0.1;

    public static long totalOrders; // 전체 주문 수
    public static long totalSales;  // 총 매출

    private String customerName;
    private String menuItem;
    private int price;
    private int orderNumber;

    static {
        System.out.println("=== " + CAFE_NAME + " 시스템 시작 ===");
        totalOrders = 0;
        totalSales = 0;
    }

    /* 생성자 */
    public CafeOrder() {
    }

    public CafeOrder(String customerName, String menuItem, int price, int orderNumber) {
        this.customerName = customerName;
        this.menuItem = menuItem;
        this.price = price;
        this.orderNumber = orderNumber;
    }

    /* 메서드 - getter, setter */
    // setter
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    // getter
    public String getCustomerName() {
        return customerName;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public int getPrice() {
        return price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    /* 메서드 - 개발자 정의 */
    int tax = (int)(getPrice() * TAX_RATE); // 가격에 따른 세금
    int totalPrice = getPrice() + tax; // 세금을 포함한 총액

    /**
     * 주문 처리, 주문번호 자동 증가, 총 매출 누적
     */
    public void placeOrder() {
        totalOrders++;
        totalSales += totalPrice;
    }

    /**
     * 영수증 출력 (세금 포함 최종 금액 계산)
     */
    public void printReceipt(){
        System.out.println("===== " + CAFE_NAME + " 영수증 =====");
        System.out.println("주문번호: " + totalOrders);
        System.out.println("고객명: " + getCustomerName());
        System.out.println("메뉴: " + getMenuItem());
        System.out.println("금액: " + getPrice() + "원");
        System.out.println("세금: " + tax + "원");
        System.out.println("총액: " + totalPrice + "원");
    }
}
