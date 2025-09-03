package edu.polymorphism.pack3.ex2;
/*
작성 순서

부모클래스 다음에 구현해야하는 기능들 작성.

자식클래스 extends 부모클래스 implements 구현기능
자식클래스 extends 부모클래스
자식클래스 implements 구현기능
=> 이렇게는 가능하지만

extends 와 implements 순서가 바뀌면 안 됨!!

 */
public class CoupangApp extends DeliveryApp implements DeliveryService {

    public CoupangApp(String userName) {
        super("쿠팡이츠", userName);
    }

    @Override
    public void orderFood() {
        System.out.println("쿠팡 주문완료! 배송으로 빠르게 이동하겠습니다.");
    }

    @Override
    public void trackOrder(String orderId) {
        System.out.println("쿠팡 주문번호: " + orderId + " GPS로 실시간 추적중입니다.");
    }
}
