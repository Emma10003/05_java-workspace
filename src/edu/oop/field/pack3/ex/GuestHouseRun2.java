package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class GuestHouseRun2 {
    public static void main(String[] args) {
        System.out.println("=== 게스트하우스 방문자 관리 시스템 ===");
        
        GuestHouse guest = new GuestHouse();
        /**
         * Scanner 이용해서 고객의 정보 저장
         * while문 활용해서 0번 입력하면 고객 정보 입력 종료
         */
        Scanner sc = new Scanner(System.in);
        int menu;
        while(true) {
            System.out.println("=== 고객 정보 저장 프로그램 ===");
            System.out.println("0. 프로그램 종료\n1. 계속 진행");
            menu = sc.nextInt();
        }
        
        // 방문자 정보 설정
        guest.setGuestName("김여행");
        guest.setCheckInDate("2024-08-27");
        guest.setRoomNumber(201);

        // static 변수 확인 (totalCount -> 최초 1회 실행이기 때문에 guest1이라고 작성해서 호출하는 대신
        //                   GuestHouse 라는 클래스 이름으로 호출하는 것이 올바른 방식이므로
        //                   자동완성에서 누락되는 것이 정상!
        System.out.println("guest 이 보이는 총 방문자 수 : " + guest.totalCount); // GuestHouse.totalCount

        // 체크인 진행
        System.out.println("----- 체크인 후 방문자 수 변화 -----");
        guest.checkIn(); // 방문자 수 1 증가
        System.out.println("guest 이 보이는 총 방문자 수 : " + guest.totalCount); // GuestHouse.totalCount
        // 28번째 줄에서 실행한 방문자 수는
        // 게스트 1번 사람만 보이는 방문자 수가 아니라
        // GuestHouse 클래스에서 자체적으로 모든 게스트하우스 사람들에게 제공하는(적용되는) 숫자이므로
        // 34번째 줄에서 보이는 총 방문자 수는 guest1, guest2 모두 방문한 횟수가 보인다.
        System.out.println("guest 이 보이는 총 방문자 수 : " + guest.totalCount); // GuestHouse.totalCount

        // 올바른 static 접근 방식
        System.out.println("전체 방문자 수 : " + GuestHouse.totalCount);

        System.out.println("=== 게스트 하우스 공통 정보 ==="); // 게스트하우스 자체에서 제공
        System.out.println("게스트하우스 이름 : " + GuestHouse.GUESTHOUSE_NAME);
        System.out.println("WIFI 비밀번호 : " + GuestHouse.WIFI_PASSWORD);

        System.out.println("=== 게스트 하우스 운영 규정(static final) ===");
        System.out.println("체크인 시간 : "+ GuestHouse.CHECK_IN_TIME);
        System.out.println("체크아웃 시간 : "+ GuestHouse.CHECK_OUT_TIME);
        System.out.println("최대 숙박일 수 : " + GuestHouse.MAX_STAY_DAYS);
        System.out.println("최소 숙박일 수 : " + GuestHouse.MIN_STAY_DAYS);
        // 여기까진 공통 정보이기 때문에 객체가 아니라 클래스로 호출.

        System.out.println("=== 방문자별 개별 정보 ===");
        guest.guestInfo(); // 게스트하우스가 공통으로 제공하는 것이 아닌, 방문자 개별로 알아야 하는 정보
    }
}
