package edu.io.pack3.ex;

import java.io.IOException;
import java.util.Scanner;

public class FilePracticeRun {
    public static void main(String[] args) {
        FilePracticeService fps = new FilePracticeService();

        Scanner sc = new Scanner(System.in);
        System.out.print("내용을 확인할 파일이름 + 확장자를 입력하세요: ");
        String fileName = sc.nextLine();

        fps.method1(fileName);
    }
}
