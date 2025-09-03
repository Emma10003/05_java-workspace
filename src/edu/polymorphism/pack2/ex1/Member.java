package edu.polymorphism.pack2.ex1;

/**
 * 부모클래스에 해당
 * └─── 일반회원, VIP 회원
 * - 필수로 Member 클래스를 상속받는 자식클래스는 각 회원타입에서 할인율을 다르게 구현
 * - 로그인, 로그아웃은 자식클래스에서 굳이 추가적으로 구현하지 않아도 됨.
 */
public abstract class Member {
    // 필드 (= 인스턴스 변수, 속성)
    protected String memberId;
    protected String memberName;
    protected String memberEmail;

    /* 메서드 : ()가 붙으면 메서드! */
    // 기본생성자 (default constructor)
    public Member() {
    }
    // 매개변수 생성자 (parameter constructor)
    public Member(String memberId, String memberName, String memberEmail) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
    }

    // getter, setter
    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getMemberEmail() {
        return memberEmail;
    }
    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    // 공통 실행 메서드(기능) - 수정 X (모든 회원이 동일하게 재정의 없이 사용)
    public void login(){
        System.out.println(getMemberName() + "님이 로그인했습니다.");
    }
    public void logout(){
        System.out.println(getMemberName() + "님이 로그아웃했습니다.");
    }

    // 추상메서드
    // 비추상 클래스에 추상 메서드가 있습니다 -> public 과 class 사이에 abstract가 없다!
    // = 자식클래스에서 필수로 작성해야 한다는 표기가 존재하지 않는데 메서드에 abstract 를 쓴다고 해서 발생하는 에러.
    public abstract double 할인율();
    public abstract void 쿠폰과혜택();
    // 일반Member = 보유하고 있는 쿠폰과 혜택이 존재하지 않습니다.
    // 구독 서비스에 따라 쿠폰과 혜택을 받으실 수 있습니다.
    
    // 프리미엄Member = 현재 ㅇㅇㅇ 쿠폰을 보유하고 있습니다.
    // 아쉽게도 혜택은 존재하지 않습니다~ㅠ
    // VIP로 구독 업그레이드 하기
    
    // VIPMember = 현재 ㅇㅇㅇ 쿠폰과 ㅇㅇㅇ 혜택 이용 가능합니다.
    // 를 MemberService에서 회원.쿠폰과혜택()으로 확인하기
}
