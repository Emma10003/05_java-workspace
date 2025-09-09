package edu.io.pack3.ex2;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePracticeService2 {
// AccessDeniedException
    public void method1(String dirName, String fileName){
        Path path;

        if(dirName != null && !dirName.isEmpty()){
            path = Path.of(dirName, fileName);
        } else { // 폴더는 선택하지 않았고, 파일명만 입력함
            path = Path.of(fileName); // java_basic 에서 fileName 에 작성한 파일을 선택하고 출력
        }

        // 폴더의 존재 확인
        System.out.println("path: " + path);
        System.out.println("path.getParent(): " + path.getParent());
        if(path.getParent() != null) {
            if(!Files.exists(path.getParent())) {
                System.out.println("폴더가 존재하지 않습니다. 폴더명을 확인해주세요.");
                return;
            }
            if(!Files.isDirectory(path.getParent())) {
                System.out.println("폴더가 아니고, 파일 형태 입니다.");
                return;
            }
            System.out.println(path.getParent() + " 가 존재합니다.");
        }

        // 파일의 존재 확인
        System.out.println("생성된 경로: " + path.toAbsolutePath()); // 완벽한 경로 확인하기
        if(!Files.exists(path)) {
            System.out.println("파일이 존재하지 않습니다.");
            return;
        }



        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (AccessDeniedException e) {
            System.out.println("파일 접근 권한이 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 문제 발생");
        }
    }
}
