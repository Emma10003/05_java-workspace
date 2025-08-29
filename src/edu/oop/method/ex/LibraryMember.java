package edu.oop.method.ex;

/**
 * 도서관 회원 정보 관리 클래스
 */
public class LibraryMember {
    /* 필드 */
    // static 공유 정보
    public static int totalMemberCount;     // 전체 회원 수
    public static int currentVisitorCount;  // 현재 도서관 방문자 수

    // static final 상수
    public static final String LIBRARY_NAME = "스마트 도서관";
    public static final String OPENING_HOURS = "09:00 - 22:00";
    public static final int MAX_BORROW_BOOKS  = 10;
    public static final int MIN_AGE_LIMIT = 14;

    // 인스턴스 변수
    private String membershipId;    // 회원증 번호
    private String memberName;      // 회원명
    private String phoneNumber;     // 전화번호
    private int borrowedBooks;      // 현재 대출 중인 도서 수
    private int age;                // 나이

    /* 초기화 블록 */
    {
        membershipId = "TEMP001";
        memberName = "임시회원";
        phoneNumber = "010-0000-0000";
        borrowedBooks = 0;
        age = 14;
    }

    static {
        totalMemberCount = 0;
        currentVisitorCount = 0;
        System.out.println("=== " + LIBRARY_NAME + " 시스템 초기화 완료 ===");
        System.out.println("운영시간: " + OPENING_HOURS);
    }


    /* 메서드 - 생성자 */
    public LibraryMember() {}

    // 한 번에 작성해서 넣어주는 묶음 setter 같은 역할을 함
    // 데이터 저장 패키지
    public LibraryMember(String membershipId, String memberName, String phoneNumber, int age) {
        this.membershipId = membershipId;
        this.memberName = memberName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    /* 메서드 - getter, setter */
    // setter
    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // getter
    public String getMembershipId() {
        return membershipId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public int getAge() {
        return age;
    }
}
