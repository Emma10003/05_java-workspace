package edu.io.pack3.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePracticeService {

    // Path
    // Files

    // 를 이용해서 1. my_logs 라는 폴더가 존재하는지 확인하고
    // 내부에 intro.txt 파일이 존재하는지 확인
    // 폴더와 파일 모두 존재하면 현대방식의 파일 읽기 방식을 활용해
    // intro.txt 내부에 작성된 글자를 모두 읽고 출력하기
    public void method1(String fileName){
        Path path = Path.of("my_logs", fileName); // my_logs 폴더의 intro.txt 파일

        if(!Files.exists(path)) {
            System.out.println("파일 없음"); // 파일/폴더 없는지 확인하는 로직
            return;
        }

        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 문제 발생");
        }
    }
}
