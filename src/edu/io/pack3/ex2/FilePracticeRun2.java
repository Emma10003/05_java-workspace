package edu.io.pack3.ex2;

import java.util.Scanner;

public class FilePracticeRun2 {
    public static void main(String[] args) {
        FilePracticeService2 fps = new FilePracticeService2();

        Scanner sc = new Scanner(System.in);
        System.out.print("폴더를 입력하시겠습니까? (yes / no) >> ");
        // 글자 입력받고 공백없음 + 모두 소문자 처리
        String answer = sc.nextLine().trim().toLowerCase();
        String dirName = "";

        if (answer.equals("yes") ||  answer.equals("y")) {
            System.out.print("폴더명을 입력하세요: ");
            dirName = sc.nextLine().trim();
        } else {
            System.out.println("기본 프로젝트 최상위 폴더로 설정됩니다.");
            dirName = "";
        }

        System.out.print("내용을 확인할 파일이름 + 확장자를 입력하세요: ");
        String fileName = sc.nextLine();

        // fileName 뒤에 확장자를 작성하지 않았을 경우, '확장자가 없다' 출력 후 프로그램 종료
        // if(!fileName.contains(".")) {
        int dotIndex = fileName.lastIndexOf('.');
        if(dotIndex != -1 || dotIndex == fileName.length()-1) {
            System.out.println("확장자가 없습니다.");
            return;
        }

        fps.method1(dirName, fileName);

    }
}
