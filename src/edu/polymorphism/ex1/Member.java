package edu.polymorphism.ex1;

public class Member {
    // 회원 정보 관련 필드들
    private String memberName;
    private String memberId;
    private String memberEmail;
    private String memberPhone;
    private String memberAddress;
    private int memberAge;
    private String memberGrade; // 일반, VIP, VVIP
    private double memberPoint;


    // 회원 관련 메서드들
    public void memberLogin() {
        System.out.println(memberName + "님이 로그인했습니다.");
    }

    public void memberLogout() {
        System.out.println(memberName + "님이 로그아웃했습니다.");
    }

    public void addMemberPoint(double point) {
        this.memberPoint += point;
        System.out.println("포인트가 " + point + "점 적립되었습니다. 현재 포인트: " + this.memberPoint);
    }

    public void useMemberPoint(double point) {
        if (this.memberPoint >= point) {
            this.memberPoint -= point;
            System.out.println("포인트 " + point + "점을 사용했습니다. 남은 포인트: " + this.memberPoint);
        } else {
            System.out.println("포인트가 부족합니다.");
        }
    }

    public void upgradeMemberGrade() {
        if (memberGrade.equals("일반")) {
            memberGrade = "VIP";
        } else if (memberGrade.equals("VIP")) {
            memberGrade = "VVIP";
        }
        System.out.println("회원등급이 " + memberGrade + "로 승급되었습니다.");
    }
}
