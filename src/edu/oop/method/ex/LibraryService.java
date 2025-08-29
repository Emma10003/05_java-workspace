package edu.oop.method.ex;

import java.util.Scanner;

/**
 * 도서관 회원 관리 기능 시스템 클래스
 */
public class LibraryService {
    // 필드 인스턴스 변수 속성
    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        while(true) {
            System.out.println("Library Menu");
            System.out.println("""
    === 멤버 관리 프로그램 ===
    1. 회원 등록
    2. 회원 정보 확인
    3. 회원 정보 수정
    4. 도서 대출
    5. 도서 반납
    6. 도서관 입장/퇴장
    7. 도서관 통계 확인
    0. 프로그램 종료
                    """);
            System.out.print("메뉴 선택: ");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1: // 회원 등록
                    System.out.println("회원을 등록할 슬롯을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // createMember() 메서드 호출하여 새 회원 생성
                    break;

                case 2: // 회원 정보 확인
                    System.out.println("회원 정보를 확인할 번호를 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // memberInform() 메서드 호출하여 회원 정보 출력
                    break;

                case 3: // 회원 정보 수정
                    System.out.println("정보를 수정할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // updateMemberInfo() 메서드 호출
                    break;

                case 4: // 도서 대출
                    System.out.println("도서를 대출할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // borrowBooks() 메서드 호출
                    break;

                case 5: // 도서 반납
                    System.out.println("도서를 반납할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // returnBooks() 메서드 호출
                    break;

                case 6: // 도서관 입장/퇴장
                    System.out.println("1=입장 / 2=퇴장");
                    System.out.print("선택: ");
                    // enterLibrary() 또는 exitLibrary() 메서드 호출
                    break;

                case 7: // 도서관 통계 확인
                    System.out.println("=== 도서관 운영 통계 ===");
                    // static 변수들과 상수들 출력
                    break;
            }


        }
    }
}
