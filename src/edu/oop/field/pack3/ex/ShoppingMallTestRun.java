package edu.oop.field.pack3.ex;

public class ShoppingMallTestRun {
    public static void main(String[] args) {
        // main에서 가장 최초로 실행하는 것은 static !!!!!! 임을 발견
        
        // 1. 3명의 회원 객체 생성 + 정보 설정

        //  자료형은                       member1이라는 공간 내부에
        //  member1         공간의        (작성될 수 있는) 데이터와
        //  공간의 크기      명칭          (사용가능한) 기능을 member1에 넣어서 사용
        ShoppingMallMember member1 = new ShoppingMallMember("user001", "김쇼핑", "kim@email.com");
        ShoppingMallMember member2 = new ShoppingMallMember("user002", "박구매", "park@email.com");
        ShoppingMallMember member3 = new ShoppingMallMember("user003", "이주문", "lee@email.com");

        // 2. 회원가입 및 방문 시뮬레이션
        System.out.println("\n--- 회원가입 및 방문 시뮬레이션 ---");
        member1.joinMember();
        member2.joinMember();
        member3.joinMember();

        // 3. 사이트 방문
        member1.visitSite();
        member1.visitSite(); // 김쇼핑 웹사이트에 2번 방문
        member2.visitSite();
        member3.visitSite();
        member3.visitSite();
        member3.visitSite(); // 이주문 웹사이트에 3번 방문

        System.out.println("\n--- 회원가입 후 통계 ---");
        System.out.println("전체 회원 수: " + ShoppingMallMember.totalMembercount + "명");
        System.out.println("일일 방문자 수: " + ShoppingMallMember.dailyVisitorCount + "명");

        System.out.println("\n=== 쇼핑몰 운영 정보 ===");
        System.out.println("쇼핑몰명: " + ShoppingMallMember.SHOPPING_MALL_NAME);
        System.out.println("고객센터: " + ShoppingMallMember.SERVICE_CENTER_NUMBER);
        System.out.println("최대 장바구니 수: " + ShoppingMallMember.MAX_CART_ITEMS + "개");
        System.out.println("최소 비밀번호 길이: " + ShoppingMallMember.MIN_PASSWORD_LENGTH + "자");

        // 장바구니와 개별 회원정보 기능을 활용하기
        System.out.println("\n********** 회원별 장바구니 정보 **********");
        member1.addToCart(10);
        member2.addToCart(25);
        member3.addToCart(60); // 장바구니는 최대 50개 담을 수 잇으므로, 장바구니 초과 조회.

        System.out.println("\n********** 개별 회원 정보 **********");
        member1.printMemberInfo();
        member2.printMemberInfo();
        member3.printMemberInfo(); // 장바구니 개수 초과로 물건을 담을 수 없어 0으로 조회됨.

        /**
         * Q1. member1으로 호출했을 때 왜 totalMemberCount에 노란 경고가 나타날까요? 자동완성이 안될까요?
         * System.out.println("전체 회원 수: " + member1.totalMembercount + "명");
         */
    }
}
