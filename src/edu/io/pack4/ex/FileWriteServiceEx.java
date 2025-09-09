package edu.io.pack4.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileWriteServiceEx {
    // method1
    /*
    생성할 파일 이름을 스캐너로 입력받고,
    내부에 finish 를 입력할 때 까지 계속 입력하도록 설정
    finish 는 대소문자 관계없이 finish 입력 자체를 소문자로 설정

    저녁.txt
    깐풍기
    삼겹살
    양꼬치
    오겹살
    피자
    핫도그
    를 입력하고, my_logs 폴더에 저녁.txt 를 생성하기
     */
    Scanner sc=new Scanner(System.in);
    public void method1(){
        System.out.print("생성할 파일명: ");
        String fileName = sc.nextLine();

        System.out.println("finish 를 입력하면 파일 작성이 종료됩니다.");
        System.out.println("파일에 저장할 내용을 입력하세요 >>");
        StringBuilder content = new StringBuilder();
        String line;

        while(!(line = sc.nextLine()).toLowerCase().equals("finish")) {
            content.append(line).append("\n");
        }

        Path path = Path.of("my_logs/" + fileName);
        try {
            Files.createDirectories(path.getParent()); // 폴더가 없으면 생성
            Files.writeString(path, content.toString()); // Files 에 문자열 저장
            System.out.println("파일 생성 완료: " + fileName);
        } catch (IOException e) {
            System.out.println("글자를 작성하던 도중 문제가 발생했을 때 처리할 로직 작성");
            // 임시저장 과 같은 로직을 넣고, 사용자가 파일을 다시 작성할 때
            // 임시로 저장된 글자를 불러오시겠습니까? 와 같은 유도를 추후 설정
        }
    }
}
