package edu.io.pack4.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteService {
    Scanner sc = new Scanner(System.in);

    public void 고전방식(){
        System.out.print("생성할 파일명을 입력하세요: ");
        String fileName = sc.nextLine();

        System.out.println("종료를 입력하면 파일 작성이 종료됩니다.");
        System.out.println("파일에 쓸 내용을 입력하세요: ");
        
        StringBuilder content = new StringBuilder(); // 문자열로 빌딩을 짓는다. 탑처럼 쌓아올린 문자열을 만드는 클래스
        String line;

        while(!(line = sc.nextLine()).equals("종료")){
            content.append(line).append("\n"); // 한줄 씩 더해주고, 엔터를 입력할 때 마다 줄바꿈 처리하기
        }

        // 모두 작성하기를 종료하면 files/ 폴더 내에 특정 파일명으로 저장하기
        File file = new File("files/" + fileName);
        
        // 디렉토리가 없으면 생성
        if(!file.exists()){
            file.getParentFile().mkdirs(); // 폴더 먼저 생성
        }

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(content.toString());
            System.out.println("파일 생성 및 쓰기 완료: " + fileName);
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류 발생");
        } finally {
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("파일을 닫는 중 문제가 발생하여 파일을 저장하지 못한 상태");
                }
            }
            sc.close();  // 스캐너 입력 닫기
        }
    }

    public void 현대방식(){

    }
}
