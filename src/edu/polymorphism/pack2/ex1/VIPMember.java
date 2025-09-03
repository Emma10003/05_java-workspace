package edu.polymorphism.pack2.ex1;

/**
 * 부모클래스인 Member를 상속받을 자식클래스
 */
public class VIPMember extends Member {
    private String 쿠폰;
    private String 혜택;

    // 생성자
    public VIPMember() {
    }
    public VIPMember(String memberId, String memberName, String memberEmail) {
        super(memberId, memberName, memberEmail);
    }
    public VIPMember(String 쿠폰, String 혜택) {
        this.쿠폰 = 쿠폰;
        this.혜택 = 혜택;
    }
    public VIPMember(String memberId, String memberName, String memberEmail, String 쿠폰, String 혜택) {
        super(memberId, memberName, memberEmail);
        this.쿠폰 = 쿠폰;
        this.혜택 = 혜택;
    }

    // getter, setter
    public String get쿠폰() {
        return 쿠폰;
    }
    public void set쿠폰(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }
    public String get혜택() {
        return 혜택;
    }
    public void set혜택(String 혜택) {
        this.혜택 = 혜택;
    }

    
    @Override
    public double 할인율() {
        return 0.25; // 25% 할인
    }

    @Override
    public void 쿠폰과혜택() {
        System.out.println(memberName + "님은 현재 " + 쿠폰 + " 쿠폰과 " + 혜택 + " 이용 가능합니다.");
    }
}
