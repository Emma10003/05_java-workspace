package edu.oop.method.ex;

import java.util.Scanner;

/**
 * 도서관 회원 관리 기능 시스템 클래스
 */
public class LibraryService {
    // 필드 인스턴스 변수 속성
    Scanner sc = new Scanner(System.in);
    LibraryMember m1 = null; // -> m1만 사용, Array의 향상된 버전인 ArrayList를 활용해 추가할 것임!
    LibraryMember m2 = null;
    LibraryMember m3 = null;

    public void displayMenu() {

        int input;
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
            input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1: // 회원 등록
                    System.out.println("회원을 등록할 슬롯을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    int select = sc.nextInt();
                    sc.nextLine();
                    // createMember() 메서드 호출하여 새 회원 생성
                    if(select < 1 || select > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중 선택하세요.");
                        return;
                    } else if (select == 1) m1 = createMember();
                    else if (select == 2) m2 = createMember();
                    else m3 = createMember();

                    break;

                case 2: // 회원 정보 확인
                    System.out.println("회원 정보를 확인할 번호를 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    select = sc.nextInt();
                    // memberInform() 메서드 호출하여 회원 정보 출력
                    if(select < 1 || select > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중 선택하세요.");
                        return;
                    } else if (select == 1) memberInform(m1);
                    // 1개의 인수가 필요하지만 0이(가) 발견되었습니다.
                    // : () 내부에 1개 이상의 매개변수를 넣어야하는데 () 내부가 빈 공간이다. 기능 규칙에 맞춰서 넣어라
                    else if (select == 2) memberInform(m2); // m2에 값을 대입하는 게 아니라, m2를 활용해서 정보를 출력.
                    else memberInform(m3);
                    break;

                case 3: // 회원 정보 수정
                    System.out.println("정보를 수정할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    select = sc.nextInt();
                    // updateMemberInfo() 메서드 호출
                    if(select < 1 || select > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중 선택하세요.");
                        return;
                    } else if (select == 1) updateMemberInfo(m1);
                        // 1개의 인수가 필요하지만 0이(가) 발견되었습니다.
                        // : () 내부에 1개 이상의 매개변수를 넣어야하는데 () 내부가 빈 공간이다. 기능 규칙에 맞춰서 넣어라
                    else if (select == 2) updateMemberInfo(m2); // m2에 값을 대입하는 게 아니라, m2를 활용해서 정보를 출력.
                    else updateMemberInfo(m3);
                    break;

                case 4: // 도서 대출
                    System.out.println("도서를 대출할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    select = sc.nextInt();
                    // borrowBooks() 메서드 호출
                    if(select < 1 || select > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중 선택하세요.");
                        return;
                    } else if (select == 1) borrowBooks(m1);
                        // 1개의 인수가 필요하지만 0이(가) 발견되었습니다.
                        // : () 내부에 1개 이상의 매개변수를 넣어야하는데 () 내부가 빈 공간이다. 기능 규칙에 맞춰서 넣어라
                    else if (select == 2) borrowBooks(m2); // m2에 값을 대입하는 게 아니라, m2를 활용해서 정보를 출력.
                    else borrowBooks(m3);
                    break;
                    

                case 5: // 도서 반납
                    System.out.println("도서를 반납할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    select = sc.nextInt();
                    // returnBooks() 메서드 호출
                    if(select < 1 || select > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중 선택하세요.");
                        return;
                    } else if (select == 1) returnBooks(m1);
                        // 1개의 인수가 필요하지만 0이(가) 발견되었습니다.
                        // : () 내부에 1개 이상의 매개변수를 넣어야하는데 () 내부가 빈 공간이다. 기능 규칙에 맞춰서 넣어라
                    else if (select == 2) returnBooks(m2); // m2에 값을 대입하는 게 아니라, m2를 활용해서 정보를 출력.
                    else returnBooks(m3);
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


    /**
     * 도서관 회원 정보 생성 메서드
     * @return 생성된 도서관 멤버정보를 각 멤버 위치에 전달
     */
    private LibraryMember createMember(){
        // 정보 입력받기
        System.out.print("멤버십 정보를 입력하세요: ");
        String createId = sc.nextLine();
        System.out.print("멤버 이름을 입력하세요: ");
        String createName = sc.nextLine();
        System.out.print("멤버 번호를 입력하세요: ");
        String createPhone = sc.nextLine();
        System.out.print("멤버 나이를 입력하세요: ");
        int createAge = sc.nextInt();

        return new LibraryMember(createId, createName, createPhone, createAge);
    }

    /**
     * 회원 정보 출력 메서드
     * @param member
     * @return
     */
    private String memberInform(LibraryMember member){
        // String.format()      = (static 메서드로 만들어짐) 정해진 형식에 원하는 값들을 끼워넣어 새로운 문자열을 만드는 메서드
        // String.toString()    = (일반   메서드로 만들어짐) 객체가 가진 데이터를 문자열로 파악하기 위해 만들어짐
        // 위와 같은 Java 개발자가 만든 기능을 활용하지 않고 출력하는 것도 가능
        //      -> member.getMembershipId() + " / " + member.getMemberName() + " / " + member.getPhoneNumber() + " / " + member.getAge()
        // String + int -> 문자열에 숫자를 이어붙여 문자열로 처리됨.
        return member.getMembershipId() + " / " + member.getMemberName()
                + " / " + member.getPhoneNumber() + " / " + member.getAge();
    }

    /**
     * 회원 정보 수정 메서드
     * @param member
     */
    private void updateMemberInfo(LibraryMember member) {
        System.out.println("수정할 회원의 이름을 입력하세요: ");
        String newName = sc.next();
        
        // 멤버 이름을 새로운 이름으로 변경
        member.setMemberName(newName);
        System.out.println("회원의 정보가 수정되었습니다.");
    }

    /**
     * 도서 대출 메서드 : 원하는 권수만큼 책 대출
     * 대출권수 최대는 10
     * @param member
     */
    private void borrowBooks(LibraryMember member) {
        System.out.println("대출할 책 권수를 입력하세요: ");
        int bookCount = sc.nextInt();

        // borrowedBooks는 static변수가 아니라 인스턴스 변수이므로 객체를 통해서 호출해야 함.
        // -> getter 메서드를 활용해 호출!
        int result = member.getBorrowedBooks() + bookCount;

        if(result > LibraryMember.MAX_BORROW_BOOKS){
            System.out.println("최대 " + LibraryMember.MAX_BORROW_BOOKS + "권만 대출 가능합니다.");
        } else {
            member.setBorrowedBooks(result);
            System.out.println(bookCount + "권 대출 완료. 총 대출 중인 도서: " + member.getBorrowedBooks() + "권");
        }
    }

    /**
     * 도서 반납 메서드
     * @param member m1, m2, m3 가 들어올 위치
     */
    private void returnBooks(LibraryMember member) {
        System.out.println("반납할 책 권수를 입력하세요: ");
        int bookCount = sc.nextInt();
        int result = member.getBorrowedBooks() - bookCount;

        if(result <= 0) {
            System.out.println("반납할 도서가 없습니다.");
        } else {
            member.setBorrowedBooks(result);
            System.out.println(bookCount + "권 반납 완료. 남은 대출 도서: " + member.getBorrowedBooks() + "권");
        }
    }
}
