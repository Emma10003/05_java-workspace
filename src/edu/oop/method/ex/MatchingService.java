package edu.oop.method.ex;

import java.util.Scanner;

/**
 * 결혼정보회사 회원 관리 서비스 클래스
 */
public class MatchingService {
    // 변수를 선언할 때는 클래스 명칭 바로 아래에 작성
    Scanner sc = new Scanner(System.in);
    private MatchingMember member = null;

    public void displayMenu() {
        int input;

        while (true) {
            System.out.println("\n=== 더조은 결혼정보회사 관리 시스템 ===");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 정보 확인");
            System.out.println("0. 프로그램 종료");
            System.out.println("=====================================");

            System.out.print("메뉴 선택: ");
            input = sc.nextInt();

            switch (input) {
                case 1: registerNewMember(); break;
                case 2: viewMemberInfo(); break;
                case 3: updateMemberDetails(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    // --- 기능 메서드 ---
    public void registerNewMember() {
        // 멤버 정보 입력받기
        System.out.println("이름을 작성하세요: ");
        String newName = sc.nextLine();
        System.out.println("나이를 작성하세요: ");
        int newAge = sc.nextInt();
        sc.nextLine();
        System.out.println("성별을 작성하세요: ");
        char newGender = sc.next().charAt(0);
        System.out.println("직업을 작성하세요: ");
        String newJob = sc.nextLine();

        if (checkAgeValid()) { // 가입이 완성되는 경우는 나이 기준이 true일 때.
            MatchingMember.totalMemberCount++;
            System.out.println(member.getMemberName() + "님이 회원가입하셨습니다. (회원ID: " + member.getMemberId() + ")");
        } else {               // 나이 기준에서 false가 되면 가입 불가.
            System.out.println("가입 연령 기준(" + MatchingMember.MIN_AGE_LIMIT + "세 ~ " + MatchingMember.MAX_AGE_LIMIT + "세)에 맞지 않아 등록이 취소됩니다.");
        }
    }

    /**
     * 회원 정보 수정
     */
    private void updateMemberDetails(){
        System.out.println("어떤 정보를 수정하시겠습니까?");
        System.out.print("1:이름 / 2:나이 / 3:직업 >> ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("이름을 입력하세요: ");
                String memberName = sc.nextLine();
                // 저장
                member.setMemberName(memberName);
                System.out.println("이름이 성공적으로 변경되었습니다.");
                break;
            case 2:
                System.out.println("나이를 입력하세요: ");
                int memberAge = sc.nextInt();
                sc.nextLine();
                // 저장
                member.setAge(memberAge);
                System.out.println("나이가 성공적으로 변경되었습니다.");
                break;
            case 3:
                System.out.println("직업을 입력하세요: ");
                String memberJob = sc.nextLine();
                sc.nextLine();
                // 저장
                member.setJob(memberJob);
                System.out.println("직업이 성공적으로 변경되었습니다.");
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
        System.out.println("수정된 최종 정보");
        viewMemberInfo();
    }

    /**
     * 나이를 확인하는 기능
     * @return 회사에서 원하는 나이 범위가 아니면 가입 불가
     */
    public boolean checkAgeValid() {
        // this. -> MatchingMember 내에서는 private 으로 가리키고 있는 필드 명칭으로 사용했음.
        //          현재 문서에서는 MatchingMember 를 member 라는 변수명칭으로 호출하고 있으므로 변경해준다!
        return member.getAge() >= MatchingMember.MIN_AGE_LIMIT && member.getAge() <= MatchingMember.MAX_AGE_LIMIT;
    }

    public void viewMemberInfo() {
        System.out.println("--- 회원 정보 ---");
        System.out.printf("ID: %s, 이름: %s, 나이: %d세, 성별: %c, 직업: %s, 매칭점수: %d점\n",
                member.getMemberId(), member.getMemberName(), member.getAge(), member.getGender(),
                member.getJob(), member.getMatchingScore());
    }


}
