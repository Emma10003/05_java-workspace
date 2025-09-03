package edu.polymorphism.pack3.ex2;

/**
 * 배달 기능에 대해 작성된 문서
 */
public interface DeliveryService {
    void orderFood();                   // 음식 주문 기능
    void trackOrder(String orderId);    // 주문ID 에 따라 주문을 추적하는 기능
}
