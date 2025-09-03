package edu.polymorphism.pack3.ex4;

/**
 * 추상클래스로 CreditCard 에 작성된 추상메서드를 interface 로 옮겨 작성한 후
 * 추상메서드가 아닌 interface CardMethods 를 활용하여 문제없이 동작하도록 설정
 */
public interface CardMethods {
    void showBenefits();        // 혜택 안내
    int calculateDiscount(int amount); // 할인 계산
    int getPointRate();         // 포인트 적립률
}
