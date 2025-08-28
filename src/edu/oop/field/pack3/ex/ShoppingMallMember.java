package edu.oop.field.pack3.ex;

/**
 * 온라인 쇼핑몰 회원 관리 시스템
 */
public class ShoppingMallMember {
    /* 필드 */
    // 공유 정보
    public static int totalMembercount = 0; // 전체 회원 수
    public static int dailyVisitorCount = 0; // 일일 방문자 수

    // static final : 공통 규정
    public static final String SHOPPING_MALL_NAME =  "더조은 온라인 쇼핑몰";
    public static final String SERVICE_CENTER_NUMBER = "1588-1234";
    public static final int MAX_CART_ITEMS = 50;
    public static final int MIN_PASSWORD_LENGTH = 8;

    // 개인정보 (인스턴스 변수)
    private String memberId; // 회원 ID
    private String memberName; // 회원명
    private String email; // 이메일
    private int cartItemCount; // 현재 장바구니 상품 수

    // 초기화 블록  :  단일 변수보다 한 단계 늦게 시작
    {
        memberId = "guest123";
        memberName = "게스트";
        email = "guest@tjemail.com";
        cartItemCount = 0;
    }
    // static 초기화 블록
    static {
        totalMembercount = 0;
        dailyVisitorCount = 0;
        System.out.println("=== " + SHOPPING_MALL_NAME + " 시스템 시작 ===");
    }

    // 생성자
    public ShoppingMallMember() {
    }

    public ShoppingMallMember(String memberId, String memberName, String email) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.email = email;
    }

    // 메서드 setter
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCartItemCount(int cartItemCount) {
        this.cartItemCount = cartItemCount;
    }

    // 메서드 getter
    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getEmail() {
        return email;
    }

    public int getCartItemCount() {
        return cartItemCount;
    }

    // 메서드 개발자가 만들어놓은 기능들

    /**
     * 회원가입 (전체 회원 수 +1)
     */
    public void joinMember(){
        totalMembercount++;
        System.out.println(getMemberName() + "님이 회원가입하셨습니다. (회원번호: " + getMemberId() + ")\n");
    }

    /**
     * 사이트 방문 (일일 방문자 수 +1)
     */
    public void visitSite(){
        dailyVisitorCount++; // 일일 방문자 수 증가
        System.out.println(getMemberName() + "님이 사이트를 방문했습니다.\n");
    }

    /**
     * 장바구니 추가
     * @param itemCount 장바구니에 추가되는 상품 수
     */
    public void addToCart(int itemCount){
        // char, String은 .equals() 를 활용
        // static final 에 관계없이 >=, >, <=, <, == 와 같은 부등호는
        //      int             int             int     와 같이 숫자(실수, 정수)에만 가능
        if(MAX_CART_ITEMS >= cartItemCount + itemCount) {
            cartItemCount += itemCount; // 장바구니에 아이템 추가 가능
            System.out.println(getMemberName() + "님의 장바구니에 "
                    + itemCount + "개의 상품이 추가되었습니다.\n");
        } else {
            System.out.println("장바구니 최대 수량(" + MAX_CART_ITEMS + "개)을 초과할 수 없습니다.");
        }
    }

    /**
     * 회원 정보 출력
     */
    public void printMemberInfo(){
        System.out.println("\n=== 회원정보 ===");
        System.out.println("ID: " + getMemberId());
        System.out.println("이름: " + getMemberName());
        System.out.println("이메일: " + getEmail());
        System.out.println("현재 장바구니 상품 수: " + getCartItemCount());
    }
}
