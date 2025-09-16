package edu.practice.day15;

/**
 * 메인 클래스
 */
public class SimpleMemberSystem {
    public static void main(String[] args) {
        try {
            MenuSystem menuSystem = new MenuSystem();
            menuSystem.start();
        } catch (Exception e) {
            System.out.println("예기치 못한 오류가 발생했습니다. 프로그램을 종료합니다.");
            System.out.println("오류메세지 출력: ");
            e.printStackTrace();
        }
    }
}
