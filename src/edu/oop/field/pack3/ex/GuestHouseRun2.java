package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class GuestHouseRun2 {
    public static void main(String[] args) {
        System.out.println("=== 게스트 하우스 공통 정보 ==="); // 게스트하우스 자체에서 제공
        System.out.println("게스트하우스 이름 : " + GuestHouse.GUESTHOUSE_NAME);
        System.out.println("WIFI 비밀번호 : " + GuestHouse.WIFI_PASSWORD);

        System.out.println("=== 게스트 하우스 운영 규정(static final) ===");
        System.out.println("체크인 시간 : "+ GuestHouse.CHECK_IN_TIME);
        System.out.println("체크아웃 시간 : "+ GuestHouse.CHECK_OUT_TIME);
        System.out.println("최대 숙박일 수 : " + GuestHouse.MAX_STAY_DAYS);
        System.out.println("최소 숙박일 수 : " + GuestHouse.MIN_STAY_DAYS);
        
        /**
         * Scanner 이용해서 고객의 정보 저장
         * while문 활용해서 0번 입력하면 고객 정보 입력 종료
         */
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("=== 고객 정보 입력 ===");
            System.out.println("0 입력 시 고객 정보 입력을 종료합니다.");
            System.out.print("방문자 성함: ");
            String name = sc.nextLine();
            if(name.equals("0")) { // 0을 String으로 입력받고, 0이 String 형태로 입력된 게 맞으면 true
                System.out.println("고객 정보 입력 프로그램을 종료합니다.");
                break;
            }
            System.out.print("체크인 날짜 (예: 2025-01-01) : ");
            String date = sc.nextLine();

            System.out.print("객실 번호: ");
//            String room =  sc.nextLine();
            int room =  sc.nextInt();
            sc.nextLine(); // nextInt 이후 생성되는 enter 처리

            GuestHouse guest = new GuestHouse();
            // 방문자 정보 설정
            guest.setGuestName(name);
            guest.setCheckInDate(date);
            guest.setRoomNumber(room);
            /*
            String room =  sc.nextLine(); 에서 오류
                필요한 타입: class 파일에서 속성명칭 왼쪽에 작성한 자료형 타입
                    int
                제공된 타입: class 파일이랑 일치하지 않고, 추후 class 내부에 작성한 변수이름에 데이터를 저장하겠다 설정한 타입
                    String
                [해야 할 일]
                클래스에 작성한 자료형을 변경할 것인가? 클래스 내부에 작성한 변수이름에 알맞게
                전달할 자료형을 수정할 것인가?

                -> 클래스에 작성한 초기 데이터 타입은 수정 자제
             */

            // 체크인 진행
            System.out.println("----- 체크인 후 방문자 수 변화 -----");
            guest.checkIn(); // 방문자 수 1 증가

            // 방문자 정보 출력
            guest.guestInfo();
        }


        /***************************************************/

        System.out.println("------------------------");

        // 올바른 static 접근 방식
        System.out.println("전체 방문자 수 : " + GuestHouse.totalCount);

        sc.close(); // 스캔 출력 종료
    }
}
