package edu.polymorphism.pack2.ex1;

/**
 * 부모클래스인 Member를 상속받을 자식클래스
 */
public class 일반Member extends Member {

    // 자식클래스에서 부모클래스에 작성된 필드만 사용하고,
    // 자식클래스는 필드를 작성하지 않은 채 메서드만 재정의 할 수 있음.
    public 일반Member(String memberId, String memberName, String memberEmail) {
        super(memberId, memberName, memberEmail);
    }

    // Member 부모클래스를 상속받으면 다른 건 몰라도,
    // 아래 할인율() 기능은 Member 클래스에서 필수로 재정의하라고 했던 기능이기 때문에 반드시 생성!
    @Override
    public double 할인율() {
        return 0.05; // 일반멤버는 5% 할인
    }

    @Override
    public void 쿠폰과혜택() {
        System.out.println(memberName + "님은 보유하신 쿠폰과 혜택이 존재하지 않습니다.");
        System.out.println("구독 서비스에 따라 쿠폰과 혜택을 받으실 수 있습니다.");
    }
}
