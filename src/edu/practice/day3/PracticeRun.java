package edu.practice.day3;

import java.util.Scanner;

public class PracticeRun {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Practice1 p1 = new Practice1("Java 프로그래밍", "김개발",25000);
        Practice2 p2 = new Practice2();
        Practice3 p3 = new Practice3();
        Practice4 p4 = new Practice4();
        Practice5 p5 = new Practice5("현대", "아반떼");

        // 원하는 문제의 주석을 해제하고 실행하세요
        /*------------------- 문제 1 -------------------*/
        System.out.println("=== 문제 1: 도서 관리 클래스 ===");
//         p1.displayInfo();
//         p1.borrowBook();
//
//         p1.displayInfo();
//         p1.returnBook();
        /*------------------- 문제 2 -------------------*/
        System.out.println("\n=== 문제 2: 스마트폰 클래스 ===");
         // 1. 모델명 입력받기
//        System.out.print("스마트폰 모델명을 입력하세요 : ");
//        String model = sc.nextLine();
//
//        // 2. 객체 매개변수 정의
//        p2.setModel(model);
//
//        // 3. 메서드 실행
//        p2.powerOn();
//
//        System.out.print("사용한 배터리 양 : ");
//        int usedBattery = sc.nextInt();
//        p2.useBattery(usedBattery);
//
//        System.out.print("충전된 배터리 양 : ");
//        int chargedBattery = sc.nextInt();
//        p2.charge(chargedBattery);

        /*------------------- 문제 3 -------------------*/
        System.out.println("\n=== 문제 3: 은행계좌 업그레이드 ===");

//        // 고객 정보 입력받기
//        System.out.println("=== 고객 정보를 입력하세요 ===");
//        System.out.print("예금주 : ");
//        p3.setAccountHolder(sc.nextLine());
//        System.out.print("계좌번호 : ");
//        p3.setAccountNumber(sc.nextLine());
//        System.out.print("잔액 : ");
//        p3.setBalance(sc.nextInt());
//        sc.nextLine(); // sc.nextInt -> sc.nextLine() 작성 시 앞에 이렇게 해줘야 함! (개행문자 이슈)
//        System.out.print("비밀번호 : ");
//        String password = sc.nextLine();
//        p3.setPassword(password);
//
//        // 메뉴
//        String menu = "1. 입금\n2. 출금\n" +
//                "3. 계좌이체\n4. 총 거래횟수 출력\n5. 계좌정보 출력\n6. 종료하기";
//        int menuNum;
//
//        accountLoop:
//        while(true){
//            System.out.println("---------------------");
//            System.out.println("=== 필요하신 업무를 선택하세요(숫자만 입력) ===");
//            System.out.println(menu);
//            System.out.println("선택 : ");
//            menuNum = sc.nextInt();
//            System.out.println("---------------------");
//
//            switch(menuNum) {
//                case 1 :
//                    System.out.print("입금하실 금액을 입력하세요 : ");
//                    p3.deposit(sc.nextLong());
//                    break;
//
//                case 2 :
//                    System.out.print("비밀번호를 입력하세요 : ");
//                    String pw1 = sc.next();
//                    System.out.print("출금하실 금액을 입력하세요 : ");
//                    long withdrawAmount = sc.nextLong();
//                    p3.withdraw(pw1, withdrawAmount);
//                    break;
//
//                case 3 :
//                    System.out.print("비밀번호를 입력하세요 : ");
//                    sc.nextLine();
//                    String pw2 = sc.nextLine();
//                    System.out.print("본인 계좌번호 : ");
//                    String myAccount = sc.nextLine();
//                    System.out.print("이체할 계좌번호 : ");
//                    String otherAccount = sc.nextLine();
//                    System.out.print("이체할 금액을 입력하세요 : ");
//                    long transferAmount = sc.nextLong();
//                    p3.transfer(pw2, myAccount, otherAccount, transferAmount);
//                    break;
//
//                case 4 :
//                    p3.checkTransactionCount();
//                    break;
//
//                case 5 :
//                    p3.getAccountInfo();
//                    break;
//
//                case 6 :
//                    System.out.println("프로그램을 종료합니다.");
//                    break accountLoop; // while문을 종료
//            }
//        }

        /*------------------- 문제 4 -------------------*/
        System.out.println("\n=== 문제 4: 학생 성적 관리 시스템 ===");
        // p4.method4();

        System.out.println("\n=== 문제 5: 자동차 관리 시스템 ===");        
        p5.displayCarInfo();
        p5.startEngine();
        p5.accelerate(50);
        p5.brake(20);
        p5.drive(100);
        p5.displayCarInfo();
    }
}
