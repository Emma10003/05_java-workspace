package edu.practice.day15;

import java.util.Scanner;

/**
 * 사용자 인터페이스 클래스
 */
public class MenuSystem {
    private Scanner scanner = new Scanner(System.in);
    private MemberService memberService = new MemberService();

    /**
     * 프로그램 시작 메서드
     */
    public void start(){
        // printWelcome() 호출
        // while(true) 무한루프로 showMainMenu() 반복 호출
        // try-catch 로 예외처리

        printWelcome();
        try{
            while(true){
                showMainMenu();
            }
        } catch(Exception e){
            System.out.println("MenuSystem에서 에러 발생");
            System.out.println("오류 메세지 출력: ");
            e.printStackTrace();
        }

    }

    /**
     * 환영 메세지 출력 메서드
     */
    private void printWelcome(){
        // 프로그램 제목과 환영 메세지를 예쁘게 출력
        System.out.println("============ 프로그램을 실행합니다. ============");
        System.out.println("⭐ 환영합니다 ⭐");
    }

    /**
     * 메인 메뉴 출력 메서드
     */
    private void showMainMenu(){
        // "1. 회원가입, 2. 프로그램 종료" 메뉴 출력
        // scanner.nextLine() 으로 입력받기
        // Integer.parseInt() 로 선택 번호 파싱
        // switch문으로 분기 처리
        // NumberFormatException 예외 처리

        System.out.println("""
1. 회원가입
2. 프로그램 종료
                """);
        System.out.print("선택 >>> ");
        String choiceString = scanner.nextLine();
        int choice = Integer.parseInt(choiceString);

        switch (choice) {
            case 1:
                registerMenu();
                break;
            case 2:
                System.out.println("============ 프로그램을 종료합니다. ============");
                System.exit(0);
                break;
        }
    }

    /**
     * 회원가입 메뉴 메서드
     */
    private void registerMenu(){
        // "아이디, 비밀번호, 이름, 이메일, 전화번호, 이미지URL" 순서대로 입력
        // 이미지 URL 은 선택사항 (빈 값이면 "기본이미지"로 설정)
        // memberService.register() 호출
        // 성공 시 이미지 폴더 경로 안내
        // pressEntertoContinue() 호출

        // 입력 받기
        System.out.println("--- 회원가입을 진행합니다 ---");
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String pw = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("이메일: ");
        String email = scanner.nextLine();
        System.out.print("전화번호: ");
        String phone = scanner.nextLine();
        System.out.print("이미지 URL: ");
        String imageUrl = scanner.nextLine();

        if(imageUrl.trim().length() == 0) {
            imageUrl = "기본이미지";
        }

        boolean isRegistered = memberService.register(id, pw, name, email, phone, imageUrl); // 회원가입 메서드 호출

        if(isRegistered) {
            System.out.println("✅ 회원가입이 완료되었습니다.");
            System.out.println("이미지 폴더 경로: " + memberService.getImagesFolderPath());
            pressEnterToContinue();
        } else {
            System.out.println("⚠️ 회원가입이 실패했습니다. 입력내용을 다시 확인해주세요.");
        }
    }

    /**
     * 프로그램 종료 메서드
     */
    private void exitProgram(){
        // 종료 확인 메시지
        // "y" 입력 시 프로그램 종료

        System.out.print("프로그램을 종료하시겠습니까? (y / n)");
        String choice = scanner.nextLine();

        if(choice.trim().toLowerCase().equals("y")) {
            System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
            System.exit(0);
        }
    }

    /**
     * 구분선 출력 메서드
     */
    private void printSeperator(){
        System.out.println("================================");
    }

    /**
     * 계속하기 대기 메서드
     */
    private void pressEnterToContinue(){
        // "엔터키를 눌러 계속..." 메시지 출력 후 입력 대기
        System.out.println("엔터키를 눌러 계속...");
        scanner.nextLine(); // 입력 대기
    }
}
